package com.example4.prototype;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication
public class Prototype {
    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example4.prototype");
        Cricket cricket1 = context.getBean(Cricket.class);
        Cricket cricket2 = context.getBean(Cricket.class);
        System.out.println("Checking whether two objects are created or not : " + (cricket1 == cricket2));

    }
}
