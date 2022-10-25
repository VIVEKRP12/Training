package com.Sprint2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Sprint2.Entity.Employee;
import com.Sprint2.Repository.EmployeeRepository;
import com.Sprint2.VO.Project;
import com.Sprint2.VO.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepo;

	@Autowired
	private RestTemplate restTemplate;

	public Employee saveEmployee(Employee employee) {
		log.info("Inside saveEmployee of EmployeeService");
		return employeeRepo.save(employee);
	}

	public ResponseTemplateVO getEmployeeWithProject(Long employeeId) {
		log.info("Inside getEmployeeWithProject of EmployeeService");
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Employee employee = employeeRepo.findByEmployeeId(employeeId);
		Project project = restTemplate.getForObject("http://localhost:9020/projects/"+employee.getProjectId(),
				Project.class);
		vo.setEmployee(employee);
		vo.setProject(project);
		return vo;
	}

}
