package com.ricky.mission3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

    @Autowired
    private CarsDAO carsDAO;

    @GetMapping
    public int getCount () {
        return carsDAO.getCountOfCars();
    }

    @GetMapping("/getAllCars")
    public List<Cars> getAllCars (){
        return carsDAO.getAllCars();
    }

    @GetMapping("/getCars/id/{id}")
    public List<Cars> getCarsById (@PathVariable int id){
        return carsDAO.getCarsById(id);
    }

    @GetMapping("/getCars/brand/{brand}")
    public List<Cars> getCarsByBrand (@PathVariable String brand){
        return carsDAO.getCarsByBrand(brand);
    }

    @PostMapping("/insertCars")
    @ResponseStatus(HttpStatus.CREATED)
    public int insertCars(@RequestBody Cars cars){
        return carsDAO.insertCars(cars);
    }

//    @PostMapping("/insertCars2")
//    @ResponseStatus(HttpStatus.CREATED)
//    public void insertCars2(@RequestBody Cars cars){
//        carsDAO.insertCars2(cars);
//    }

    @PutMapping("/updateCars/{id}")
    public void updateCars(@RequestBody Cars cars, @PathVariable int id){
        carsDAO.updateCars(id, cars);
    }

    @DeleteMapping("/deleteCars/{id}")
    public void deleteCars(@PathVariable int id){
        carsDAO.deleteCars(id);
    }
}
