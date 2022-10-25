package com.Sprint2.VO;

import com.Sprint2.Entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResponseTemplateVO {
	
	private Employee employee;
	private Project project;

}
