package com.ecs.customize.action;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAction {

    @GetMapping("/find")
    public String find(){
        return "find more";
    }
    
    
    

}
