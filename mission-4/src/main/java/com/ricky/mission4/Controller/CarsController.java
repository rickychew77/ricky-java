package com.ricky.mission4.Controller;

import com.ricky.mission4.Model.Cars;
import com.ricky.mission4.Repository.CarsDAO;
import com.ricky.mission4.Service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

    @Autowired
    private CarsService carsService;

    @GetMapping
    public int getCount () {
        return carsService.getCountOfCars();
    }

    @GetMapping("/getAllCars")
    public List<Cars> getAllCars (){
        return carsService.getAllCars();
    }

    @GetMapping("/getCars/id/{id}")
    public List<Cars> getCarsById (@PathVariable int id){
        return carsService.getCarsById(id);
    }

    @GetMapping("/getCars/brand/{brand}")
    public List<Cars> getCarsByBrand (@PathVariable String brand){
        return carsService.getCarsByBrand(brand);
    }

    @PostMapping("/insertCars")
    @ResponseStatus(HttpStatus.CREATED)
    public int insertCars(@RequestBody Cars cars){
        return carsService.insertCars(cars);
    }

//    @PostMapping("/insertCars2")
//    @ResponseStatus(HttpStatus.CREATED)
//    public void insertCars2(@RequestBody Cars cars){
//        carsDAO.insertCars2(cars);
//    }

    @PutMapping("/updateCars/{id}")
    public void updateCars(@RequestBody Cars cars, @PathVariable int id){
        carsService.updateCars(cars, id);
    }

    @DeleteMapping("/deleteCars/{id}")
    public void deleteCars(@PathVariable int id){
        carsService.deleteCars(id);
    }
}
