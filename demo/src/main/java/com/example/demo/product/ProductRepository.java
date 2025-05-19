package com.example.demo.product;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {

    private Map<Integer, String> db = new HashMap<>();
    private int id = 1;


    // 구단 조회
    public String findProduct() {
        return db.get(1);
    }

    // 야구 구단 등록
    public void save(){
        db.put(id++, "키움따운");
    }

}
