package com.coding.department.services;

import java.util.Optional;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.department.entity.Department;
import com.coding.department.repository.DepartmentRepository;


@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(DepartmentService.class);
	
	public Department saveDepartment(Department department) {
		logger.info("inside saveDepartment(Department) of DepartmentService");
		return departmentRepository.save(department);
	}
	
	public Optional<Department> findDepartmentById(Long departmentId) {
		logger.info("inside findDepartmentById() of DepartmentService");
		return departmentRepository.findById(departmentId);
	}

}
