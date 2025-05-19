package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


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
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String findProduct() {
        System.out.println("GET");
        return productService.findProduct();
    }

    // 구단 등록
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public void  setProduct(){
        System.out.println("POST");
        productService.save();
    }



}
