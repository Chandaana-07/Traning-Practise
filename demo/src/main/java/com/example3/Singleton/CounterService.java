package com.example3.Singleton;

import org.springframework.stereotype.Component;

@Component
public class CounterService {
private int a=1;
public void increase(){
   a++;
    System.out.println("The value of a is = "+a);
}
private int b=100;
public void decrement() {
    b--;
    System.out.println("The value of b is = " + b);
}


}
