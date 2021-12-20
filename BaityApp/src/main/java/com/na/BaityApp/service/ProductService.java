package com.na.BaityApp.service;


import com.na.BaityApp.entity.Product;
import com.na.BaityApp.repositories.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;


@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        log.info("Inside saveProduct in ProductService");
        return productRepository.save(product);
    }

    public Product findProductById(@PathVariable("id") Long id) {
        log.info("Inside findProductById in ProductService");
        return productRepository.findProductById(id);
    }

    public List<Product> findProductByIds(@PathVariable("ids") List<String> id) {
        log.info("Inside findProductById in ProductService");
        List<Long> ids = new ArrayList();
        for(String item: id) {
            ids.add(Long.parseLong(item));
        }
        return productRepository.findAllById(ids);
    }


    public List<Product> getAllProduct() {
        log.info("Inside findProductById in ProductService");
        return productRepository.findAll();
    }
}
