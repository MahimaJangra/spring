package com.spring.jdbc.impl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.Employee;

public class jdbcOperationsEmpImpl implements jdbcOperationsEmp {

	private JdbcTemplate template;
	
	
	public jdbcOperationsEmpImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	public jdbcOperationsEmpImpl(JdbcTemplate template) {
		super();
		this.template = template;
	}


	public int insert(Employee Emp) {
		// TODO Auto-generated method stub
		//AbstractApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
		//JdbcTemplate template= context.getBean("jdbcTemplate",JdbcTemplate.class);
        
		String query= "insert into emp(id,name,city) values(?,?,?)";
        int result= this.template.update(query,Emp.getId(),Emp.getName(),Emp.getCity());
        
		return result;
	}


	public JdbcTemplate getTemplate() {
		return template;
	}


	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	
}
