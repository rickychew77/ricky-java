package com.ricky.mission2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Setter @Getter @NoArgsConstructor
public class Cars implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @Column (nullable = false, unique = true)
    private String brand;

    @Column (nullable = false)
    private String model;

    public Cars(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }


}
