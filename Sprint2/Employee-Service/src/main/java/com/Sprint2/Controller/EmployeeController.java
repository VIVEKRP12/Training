package com.Sprint2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sprint2.Entity.Employee;
import com.Sprint2.Service.EmployeeService;
import com.Sprint2.VO.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		log.info("Inside saveEmployee of EmployeeController");
		return employeeService.saveEmployee(employee);
		
	}
	@GetMapping("/{id}")
	public ResponseTemplateVO getEmployeeWithProject(@PathVariable("id") Long employeeId) {
		log.info("Inside getEmployeeWithProject of EmployeeController");
		return employeeService.getEmployeeWithProject(employeeId);
	}
	
}
