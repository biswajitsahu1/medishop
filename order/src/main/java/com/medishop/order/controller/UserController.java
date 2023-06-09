package com.medishop.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user/home")
    public String home(){
        return "home";
    }

    @GetMapping("/user/products")
    public String product(){
        return "user_medicine";
    }

    @GetMapping("/user/cart")
    public String cart(){
        return "cart_page";
    }
}
