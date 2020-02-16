package com.ricky.mission2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

    @Autowired
    private CarsRepository carsRepository;

    @GetMapping
    public Iterable findAll() {
        return carsRepository.findAll();
    }

    @GetMapping("/brand/{carsBrand}")
    public List findByBrand(@PathVariable String carsBrand) {
        return carsRepository.findByBrand(carsBrand);
    }

    @GetMapping("/{id}")
    public Cars findOne(@PathVariable long id) {
        return carsRepository.findById(id)
                .orElseThrow(CarsNotFoundException::new);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cars create(@RequestBody Cars cars) {
        return carsRepository.save(cars);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        carsRepository.findById(id)
                .orElseThrow(CarsNotFoundException::new);
        carsRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Cars updateCars(@RequestBody Cars cars, @PathVariable long id) {
        if (cars.getId() != id) {
            throw new CarsIdMismatchException();
        }
        carsRepository.findById(id)
                .orElseThrow(CarsNotFoundException::new);
        return carsRepository.save(cars);
    }
}
