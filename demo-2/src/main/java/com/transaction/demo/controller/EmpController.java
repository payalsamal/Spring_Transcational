package com.transaction.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transaction.demo.model.EmpModel;
import com.transaction.demo.serviceimpl.EmpServiceImpl;

@RestController
@RequestMapping("v1/emp")
public class EmpController {

	@Autowired
	private EmpServiceImpl empServiceImpl;

	@PostMapping("/save")
	public String saveEmp(@RequestBody EmpModel model) {

		return empServiceImpl.saveEmployee(model);

	}

}
