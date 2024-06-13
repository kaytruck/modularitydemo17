package com.example.modulith.modularitydemo17.product;

import org.springframework.stereotype.Service;

import com.example.modulith.modularitydemo17.product.dto.ProductDto;

@Service
public class ProductService {
    public ProductDto retrieveProduct() {
        ProductDto productDto = new ProductDto();
        productDto.setName("copen");
        return productDto;
    }
}
