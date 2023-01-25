package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.impl.jdbcOperationsEmp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Started!" );
//        AbstractApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
//		JdbcTemplate template= context.getBean("jdbcTemplate",JdbcTemplate.class);
//        
//		String query= "insert into emp(id,name,city) values(?,?,?)";
//        int result= template.update(query,3,"ram","patiala");
//        System.out.println("inserted-> "+result);
        
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        jdbcOperationsEmp EmpOpObj = (jdbcOperationsEmp) context.getBean("EmpOpObj");
        Employee Emp = new Employee();
        Emp.setCity("bathinda");
        Emp.setId(9);
        Emp.setName("harsh");
        
        int result= EmpOpObj.insert(Emp);
        System.out.println("inserted->"+result);
        
    }
}
