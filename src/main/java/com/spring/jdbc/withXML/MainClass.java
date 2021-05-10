package com.spring.jdbc.withXML;

import com.spring.jdbc.withXML.dao.EmployeeDao;
import com.spring.jdbc.withXML.entities.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/withXML/jdbcconfig.xml");
		EmployeeDao edao = context.getBean("edao", EmployeeDao.class);
		Employee e = new Employee(3, "Ajay", "Lucknow");

		//Insert data
		//edao.insert(e);


		//delete data
		//edao.deleteById(7);

		// update row data
		//edao.update(e);

		//get employee by id
		//System.out.println(edao.getById(1));

		//get all employees
		edao.getAll().forEach(System.out::println);
	}
}
