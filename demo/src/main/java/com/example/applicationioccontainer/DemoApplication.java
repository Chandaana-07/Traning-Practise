package com.example.applicationioccontainer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public  static void main(String args[]){
		ApplicationContext context=new AnnotationConfigApplicationContext("com.example.applicationioccontainer");

		Move move=context.getBean(Move.class);//context->container, getBean is the method set object in application-context, move is the object
		move.display();
	}

}
