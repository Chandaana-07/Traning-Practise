package com.example2.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Notification {
    @Autowired
    private MessageService service;
    public void notifyUser(){
        service.send();
    }
}
