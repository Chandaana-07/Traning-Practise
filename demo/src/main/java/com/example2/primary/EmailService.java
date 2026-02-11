package com.example2.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailService implements  MessageService {
    @Override
    public void send(){
        System.out.println("Email Sent Successfully");
    }

}
