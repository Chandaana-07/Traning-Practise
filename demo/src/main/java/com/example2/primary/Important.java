package com.example2.primary;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication
public class Important {
    public static void main(String args[]){
        ApplicationContext context=new AnnotationConfigApplicationContext("com.example2.primary");
        Notification notify=context.getBean(Notification.class);
        notify.notifyUser();
    }
}
