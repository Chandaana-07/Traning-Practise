package com.example5.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanController{
    @Autowired
    private HelloBean hb;
    @GetMapping("/good")//like good anything we can write
    public String  hey(){
        return  hb.hiBean() +hb;
    }
}