package com.example.resttemplateproject.service;

import com.example.resttemplateproject.DTO.ProductDto;
import com.example.resttemplateproject.entity.Products;
import org.apache.tomcat.util.json.ParseException;

public interface ProductService {
    Products getAllProduct(ProductDto productDto) throws ParseException;
    Products createNewProduct(ProductDto productDto);
    Products updateProduct(ProductDto productDto);
    Products deleteProduct(Long id);
}
