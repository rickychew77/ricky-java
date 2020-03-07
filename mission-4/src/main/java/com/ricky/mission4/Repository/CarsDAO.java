package com.ricky.mission4.Repository;

import com.ricky.mission4.RowMapper.CarsRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.ricky.mission4.Model.Cars;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CarsDAO {

    private JdbcTemplate jdbcTemplate;

    private SimpleJdbcInsert simpleJdbcInsert;

    @Autowired
    public void setDataSource(final DataSource mysqlDataSource){
        jdbcTemplate = new JdbcTemplate(mysqlDataSource);
        simpleJdbcInsert = new SimpleJdbcInsert(mysqlDataSource).withTableName("cars").usingGeneratedKeyColumns("id");
    }

    public int getCountOfCars() {
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM cars", Integer.class);
    }

    public List<Cars> getAllCars() {
        return jdbcTemplate.query("SELECT * FROM cars", new CarsRowMapper());
    }

    // this method can be replaced with Cars instead of List<Cars> since ID is unique in the DB but keeping it like this
    // for consistency with other method
    public List<Cars> getCarsById(int id){
        return jdbcTemplate.query("SELECT * FROM cars WHERE id = ?", new Object[] {id}, new CarsRowMapper());
    }

    public List<Cars> getCarsByBrand(String brand){
        return jdbcTemplate.query("SELECT * FROM cars WHERE brand = ?", new Object[] {brand}, new CarsRowMapper());
    }

    public int insertCars(Cars cars){
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("id", cars.getId());
        parameters.put("brand", cars.getBrand());
        parameters.put("model", cars.getModel());

        return simpleJdbcInsert.execute(parameters);

    }
//    simple but could not use autogenerated column (have to explicitly add the ID)
//    public void insertCars2 (Cars cars){
//        jdbcTemplate.update("INSERT INTO cars VALUES (?, ?, ?)", cars.getId(), cars.getBrand(), cars.getModel());
//    }

    public void updateCars (Cars updateCars, int id){
        jdbcTemplate.update("UPDATE cars SET brand = ?, model = ? WHERE id = ?", updateCars.getBrand(), updateCars.getModel(), id);
    }

    public void deleteCars (int id){
        jdbcTemplate.update("DELETE FROM cars WHERE id = ?", id);
    }
}
