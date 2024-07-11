package com.jdbc.bootjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdbc.bootjpa.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
