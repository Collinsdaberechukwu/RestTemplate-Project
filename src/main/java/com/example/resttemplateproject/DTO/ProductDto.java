package com.example.resttemplateproject.DTO;

import lombok.Data;

@Data
public class ProductDto {
    private Long id;
    private String description;
    private Double price;
    private Integer stock;
    private String brand;
}
