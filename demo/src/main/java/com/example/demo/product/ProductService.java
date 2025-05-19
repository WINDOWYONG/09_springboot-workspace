package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // 구단 조회 메소드
    public String findProduct() {
        return productRepository.findProduct();
    }

    // 구단 등록
    public void save() {
        productRepository.save();
    }

}
