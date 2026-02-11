package com.example4.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cricket {
    public void practise(){
        System.out.println("ViratKohli is practising in  this stadium");

    }
    public void bowl(){
        System.out.println("HardikPandya is bowling");
    }
    public void wicket(){
        System.out.println("RohitSharma is WicketKeeper");
    }
}
