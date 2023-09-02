package com.example.resttemplateproject.DTO;

import lombok.Data;

@Data
public class ProductResponse {
    private String description;
    private Double price;
    private Integer stock;
    private String brand;
}
