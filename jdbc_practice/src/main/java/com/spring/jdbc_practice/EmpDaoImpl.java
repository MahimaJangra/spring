package com.spring.jdbc_practice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc_practice.EmpDao.EmpDao;
public class EmpDaoImpl implements EmpDao {

	JdbcTemplate jdbctemplate;
//	
//	public JdbcTemplate getJdbctemplate() {
//		return jdbctemplate;
//	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	public int insert(Emp emp) {

		String query="insert into emp(id,name,city) values(?,?,?);";
		int result=this.jdbctemplate.update(query,emp.getId(),emp.getName(),emp.getCity()); 
		
		return result;
	}

}
