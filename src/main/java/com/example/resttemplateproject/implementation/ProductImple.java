package com.example.resttemplateproject.implementation;

import com.example.resttemplateproject.DTO.ProductDto;
import com.example.resttemplateproject.DTO.ProductResponse;
import com.example.resttemplateproject.entity.Products;
import com.example.resttemplateproject.service.ProductService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ProductImple implements ProductService {

    private RestTemplate restTemplate;
    @Override
    public Products getAllProduct(ProductDto productDto) throws ParseException {
        String url = "'https://dummyjson.com/products'";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET,entity,String.class);
        System.out.println("Json response : -->" + response.getBody());
        List<ProductResponse> ProductDtoResponseList = new ObjectMapper().convertValue(new JSONParser(response.getBody())
                        .object().get("products"), new TypeReference<List<ProductResponse>>() {
                });
        return (Products) ProductDtoResponseList;


//        System.out.println("Json response:-->"+response.getBody());
//        List<TodoResponse> todoResponseList = new ObjectMapper().convertValue(new JSONParser(response.getBody())
//                .object().get("todos"), new TypeReference<List<TodoResponse>>() {
//        });
//        return todoResponseList;
    }

    @Override
    public Products createNewProduct(ProductDto productDto) {
        return null;
    }

    @Override
    public Products updateProduct(ProductDto productDto) {
        return null;
    }

    @Override
    public Products deleteProduct(Long id) {
        return null;
    }
}
