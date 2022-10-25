package com.Sprint2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sprint2.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	Employee findByEmployeeId(Long employeeId);

	

	
}
