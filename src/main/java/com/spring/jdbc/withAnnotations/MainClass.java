package com.spring.jdbc.withAnnotations;


import com.spring.jdbc.withAnnotations.dao.EmployeeDao;
import com.spring.jdbc.withAnnotations.entities.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
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
