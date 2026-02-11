package com.example3.Singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Singleton {
    public static void main
            (String args[]){
        ApplicationContext context=new AnnotationConfigApplicationContext("com.example3.Singleton");
        CounterService c1=context.getBean(CounterService.class);
        CounterService c2=context.getBean(CounterService.class);
        c1.decrement();
        c1.increase();
        System.out.println("Checking whether the bean created two objects or not :" +(c1==c2));;;

    }
}
