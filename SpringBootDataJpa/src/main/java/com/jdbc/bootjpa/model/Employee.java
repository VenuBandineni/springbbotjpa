package com.jdbc.bootjpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
    private Integer eid;
	@Column(nullable = false)
    private String  ename;
	@Column(nullable = false, unique = true)
    private String email;
	@Column(nullable = false)
    private Double sal;
	@Column(nullable = false)
    private Integer deptno;
	@Column(nullable = false)
    private String designation;
    
    
}
