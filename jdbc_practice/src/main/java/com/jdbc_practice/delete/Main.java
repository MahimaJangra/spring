package com.jdbc_practice.delete;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JdbcTemplate template= new JdbcTemplate();
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/jdbc");
		ds.setUsername("root");
		ds.setPassword("Mani@1911");
		template.setDataSource(ds);
		System.out.println(template.update("delete from emp where id=0;"));

	}

}
