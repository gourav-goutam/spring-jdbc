package com.spring.jdbc.withAnnotations.dao;

import com.spring.jdbc.withXML.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("edao")
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}

	@Override
	public void insert(Employee e) {
		String query="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getCity()+"')";  
		int r = jdbcTemplate.update(query);
		System.out.println(r +" row inserted : "+e.toString());
	}

	@Override
	public Employee getById(int id) {
		String query = "select * from employee where id = ? ";
		Employee e = jdbcTemplate.queryForObject(query, new Object[]{id}, new EmployeeRowMapper());
		return e;
	}

	@Override
	public void update(Employee e) {
		String query = "update employee set name='"+e.getName()+"',city='"+e.getCity()+"' where id='"+e.getId()+"' ";
		int r = jdbcTemplate.update(query);
		System.out.println(r +" row updated : "+e.toString());
	}

	@Override
	public void deleteById(int id) {
		String query="delete from employee where id=?";
		int r = jdbcTemplate.update(query,id);
		System.out.println(r +" row deleted");
	}

	@Override
	public List<Employee> getAll() {
		String query = "select * from employee ";
		List<Employee> employees = jdbcTemplate.query(query, new EmployeeRowMapper());
		return employees;
	}
	
	

}
