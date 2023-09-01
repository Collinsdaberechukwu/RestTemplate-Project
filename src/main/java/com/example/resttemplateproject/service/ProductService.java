package com.example.resttemplateproject.service;

import com.example.resttemplateproject.DTO.ProductDto;
import com.example.resttemplateproject.entity.Products;

public interface ProductService {
    Products getAllProduct(Long id);
    Products createNewProduct(ProductDto productDto);
    Products updateProduct(ProductDto productDto);
    Products deleteProduct(Long id);
}
