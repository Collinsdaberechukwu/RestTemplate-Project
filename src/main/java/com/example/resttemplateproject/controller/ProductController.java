package com.example.resttemplateproject.controller;

import com.example.resttemplateproject.DTO.ProductDto;
import com.example.resttemplateproject.DTO.ProductResponse;
import com.example.resttemplateproject.service.ProductService;
import org.apache.tomcat.util.json.ParseException;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@RestController
@RequestMapping("/api/v1/us")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("goods")
    public ResponseEntity<ProductDto> getAllProduct(@PathVariable ProductDto productDto) throws ParseException {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity httpEntity = new HttpEntity(httpHeaders);
        ResponseEntity<ProductDto> ProductDto = restTemplate.exchange("'https://dummyjson.com/products'",HttpMethod.GET,httpEntity, ProductDto.class);
        return ProductDto;
//        productService.getAllProduct(id);
//        return new ResponseEntity<>(HttpStatus.OK);
    }
}
