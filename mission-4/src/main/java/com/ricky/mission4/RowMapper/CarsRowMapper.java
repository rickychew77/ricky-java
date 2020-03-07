package com.ricky.mission4.RowMapper;

import com.ricky.mission4.Model.Cars;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CarsRowMapper implements RowMapper<Cars> {

    @Override
    public Cars mapRow(ResultSet rs, int RowNum) throws SQLException {
        Cars cars = new Cars();

        cars.setId(rs.getInt("ID"));
        cars.setBrand(rs.getString("Brand"));
        cars.setModel(rs.getString("Model"));

        return cars;

    }
}
