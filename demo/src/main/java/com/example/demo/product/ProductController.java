package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;


@Controller
@ResponseBody
public class ProductController {

    @Autowired
    private ProductService productService;


    // 사용자(화면)가 어떤 요청을 하면
    // 그에 맞는 로직을 수행한다. => 서비스한테 값을 받아서 전달해서  명령

    // 상품 조회
    // REStful API를 작성할때 틀이 있다.
    // 1. url = > "http://localhost:8081"
    // 2. 방식 설정 = > method = RequestMethod.GET || POST
    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public Product findProduct(@PathVariable("id") int id) {
        System.out.println(id);
        return productService.findProduct(id);
    }

    // 구단 등록
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public void  setProduct(@RequestBody Product product) {
        System.out.println("POST");
        productService.save(product);
    }



}
