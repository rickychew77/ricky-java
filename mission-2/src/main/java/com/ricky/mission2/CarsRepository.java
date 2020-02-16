package com.ricky.mission2;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CarsRepository extends CrudRepository<Cars, Long> {
    List<Cars> findByBrand(String brand);
}