package com.example.applicationioccontainer;
import org.springframework.stereotype.Component;

@Component
public class App {
    public void start() {
        System.out.println("App is going to start");
    }

    public void run() {
        System.out.println("App is going to run");
    }
}


