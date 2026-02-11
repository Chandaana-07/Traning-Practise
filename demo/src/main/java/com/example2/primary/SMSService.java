package com.example2.primary;

import org.springframework.stereotype.Component;

@Component
public class SMSService implements MessageService{
    @Override
    public void send(){
        System.out.println("SMS sent succesfully");
    }
}
