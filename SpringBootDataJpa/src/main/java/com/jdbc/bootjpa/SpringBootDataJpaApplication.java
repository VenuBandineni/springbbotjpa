package com.jdbc.bootjpa;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jdbc.bootjpa.service.IEmployeeService;

@SpringBootApplication
public class SpringBootDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDataJpaApplication.class, args);
		System.out.println("This Is SpringBoot Data Jpa...!!!!");
		
		Scanner sc=new Scanner(System.in);
		IEmployeeService service = context.getBean(IEmployeeService.class);
		System.out.println("press 1 : To Add Employee -->>");
		int choice=sc.nextInt();
		switch(choice) {
		case 1: service.addEmployee();
		}
	}

}
