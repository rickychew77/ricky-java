package com.ricky.mission4.Service;

import com.ricky.mission4.Model.Cars;
import com.ricky.mission4.Repository.CarsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarsService {

    @Autowired
    private CarsDAO carsDAO;

    public int getCountOfCars() {
        return carsDAO.getCountOfCars();
    }

    public List<Cars> getAllCars() {
        return carsDAO.getAllCars();
    }

    public List<Cars> getCarsById(int id) {
        return carsDAO.getCarsById(id);
    }

    public List<Cars> getCarsByBrand(String brand) {
        return carsDAO.getCarsByBrand(brand);
    }

    public int insertCars(Cars cars) {
        return carsDAO.insertCars(cars);
    }

    public void updateCars(Cars cars, int id) {
        carsDAO.updateCars(cars, id);
    }

    public void deleteCars(int id) {
        carsDAO.deleteCars(id);
    }

}
