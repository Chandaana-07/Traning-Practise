package com.example1.qualifier;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MainApp {
    public static void main(String args[]){
        ApplicationContext context=new AnnotationConfigApplicationContext("com.example1.qualifier");
Notification notify=context.getBean(Notification.class);
notify.notifyUser();
    }
}
