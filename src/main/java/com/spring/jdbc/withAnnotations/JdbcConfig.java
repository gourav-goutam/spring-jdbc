package com.spring.jdbc.withAnnotations;

import com.spring.jdbc.withAnnotations.dao.EmployeeDao;
import com.spring.jdbc.withAnnotations.dao.EmployeeDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.spring.jdbc.withAnnotations.dao")
public class JdbcConfig {

    @Bean("ds")
    public DriverManagerDataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

//    @Bean("edao")
//    public EmployeeDao getEmployeeDao(){
//        EmployeeDaoImpl edao = new EmployeeDaoImpl();
//        edao.setJdbcTemplate(getJdbcTemplate());
//        return edao;
//    }
}
