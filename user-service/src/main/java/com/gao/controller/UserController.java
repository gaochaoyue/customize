package com.gao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/find")
    public String hi(){
        /*System.out.println("request is coming...");
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            System.out.println("线程被打断... " + e.getMessage());
        }*/
        return "find more";
    }
}	
