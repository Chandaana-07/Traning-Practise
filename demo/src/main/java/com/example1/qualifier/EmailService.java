package com.example1.qualifier;

import org.springframework.stereotype.Component;

@Component("EmailService")
public class EmailService implements MessageService {
    public void send() {
        System.out.println("Sending Email..");
    }
}
