package com.workshop.demo;

import com.workshop.demo.module.Laptop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args); //for create object without using *new
		Laptop laptop = context.getBean(Laptop.class); //provide the class name
		laptop.compile();

		System.out.println(laptop.hashCode());

		Laptop laptop1 = context.getBean(Laptop.class);
		System.out.println(laptop1.hashCode());

	}

}
