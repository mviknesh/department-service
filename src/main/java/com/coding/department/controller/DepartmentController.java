package com.coding.department.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding.department.entity.Department;
import com.coding.department.services.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	public static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody  Department department) {
		logger.info("inside saveDepartment(Department) of DepartmentController");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Optional<Department> findDepartmentById(@PathVariable("id") Long departmentId) {
		logger.info("inside findDepartmentById() of DepartmentController");
		return departmentService.findDepartmentById(departmentId);
	}

	
}
