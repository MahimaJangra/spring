package com.spring.jdbc_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc_practice.EmpDao.EmpDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        EmpDao opObj= (EmpDao) context.getBean("opObj");
        Emp emp=(Emp) context.getBean("emp");
        
        System.out.println(opObj.insert(emp));
    }
}
