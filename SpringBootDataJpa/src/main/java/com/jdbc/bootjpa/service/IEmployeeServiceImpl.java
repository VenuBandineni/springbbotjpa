package com.jdbc.bootjpa.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdbc.bootjpa.model.Employee;
import com.jdbc.bootjpa.repository.EmployeeRepository;
@Service
public class IEmployeeServiceImpl implements IEmployeeService {
    private Scanner sc=new Scanner(System.in);
    @Autowired
    private EmployeeRepository eRepo;
    
	public void addEmployee() {
		Employee e=new Employee();
		System.out.println("Enter Employee Name : ");
		e.setEname(sc.next());
		System.out.println("Enter Employee Email : ");
		e.setEmail(sc.next());
		System.out.println("Enter Employee Salary : ");
		e.setSal(sc.nextDouble());
		System.out.println("Enter Employee Department : ");
		e.setDeptno(sc.nextInt());
		System.out.println("Enter Employee Designation : ");
		e.setDesignation(sc.next());
		if(eRepo.save(e)!=null) System.out.println("Employee Added..!!!");
		else System.out.println("Invalid Credentials...!!!");
		
	}
}
