package com.example.resttemplateproject.entity;


import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
public class Products {
    private Long id;
    private String description;
    private Double price;
    private Integer stock;
    private String brand;

}
