package com.example.applicationioccontainer;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component//creates object of both move and app
public class Move{
    @Autowired
    private App app;//Dependency

    @PostConstruct//calls the method
    public void print(){
        System.out.println("App is going to print something");
        app.run();
    }

    @PostConstruct//calls the method
    public void display(){
        System.out.println("App is going to display something");
        app.start();
    }
}