package com.workshop.demo.module;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //create a bean when start a program
@Scope(value = "prototype") //using difference instance using one object
public class Laptop {
    public void compile(){
        System.out.println("Laptop Compiling....");
    }
}
