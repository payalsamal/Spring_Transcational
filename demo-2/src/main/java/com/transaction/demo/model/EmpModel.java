package com.transaction.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee_tab")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmpModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int empId;
	private String empName;
	private String deptName;
	private String empMail;

}
