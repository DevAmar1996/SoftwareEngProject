package com.na.BaityApp.controllers;

import com.na.BaityApp.entity.Product;
import com.na.BaityApp.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/")
    public Product saveProduct(@RequestBody Product product) {
        log.info("Inside saveProduct in Product Controller");
        return productService.saveProduct(product);
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable("id") Long id) {
        log.info("Inside findProductById in Product Controller");
        return productService.findProductById(id);
    }

    @GetMapping("some/{ids}")
    public List<Product> findProductsByIds(@PathVariable("ids") List<String> ids) {
        log.info("Inside findProductById in Product Controller");
        return productService.findProductByIds(ids);
    }

    @GetMapping("/")
    public List<Product> getAllProduct() {
        log.info("Inside findProductById in ProductService");
        return productService.getAllProduct();
    }
}
