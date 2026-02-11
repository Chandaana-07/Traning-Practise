package com.example6.PostConstructPreDestroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class Bean {
    @PostConstruct
public void init(){
    System.out.println("Bean initialized");
}
public Bean(){
    System.out.println("Bean created");
}
public void perform(){
    System.out.println("Bean is performing some task");
}
@PreDestroy
public void destroy(){
    System.out.println("Bean destroyed");
}
}
