package com.example5.Rest;


import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Service
@Scope(value = WebApplicationContext.SCOPE_REQUEST,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class HelloBean{
    public HelloBean(){
        System.out.println("Hello Bean request");
    }
    public String hiBean(){
        return "object reference " ;
    }

}