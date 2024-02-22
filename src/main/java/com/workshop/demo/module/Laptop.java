package com.workshop.demo.module;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Laptop {
    public void compile(){
        System.out.println("Laptop Compiling....");
    }
}
