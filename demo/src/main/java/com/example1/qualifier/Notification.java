package com.example1.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Notification {
    @Autowired
    @Qualifier("SMSService")
    private MessageService service;
    public void notifyUser(){
        service.send();
    }
}
