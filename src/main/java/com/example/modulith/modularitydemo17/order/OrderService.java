package com.example.modulith.modularitydemo17.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.modulith.modularitydemo17.product.ProductService;

@Service
public class OrderService {
    
    private ProductService productService;

    @Autowired
    public OrderService(ProductService productService) {
        this.productService = productService;
    }

    public void getOrder() {
        var productDto = productService.retrieveProduct();
        System.out.println(productDto.getName());
    }
}
