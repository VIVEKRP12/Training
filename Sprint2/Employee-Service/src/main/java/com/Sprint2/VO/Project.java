package com.Sprint2.VO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Project {
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long projectId;
		private String projectTitle;
		private String clientCode;

}
