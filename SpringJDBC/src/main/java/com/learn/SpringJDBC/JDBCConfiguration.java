package com.learn.SpringJDBC;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.learn.SpringJDBC.DAO.EmployeeDAO;
import com.learn.SpringJDBC.DAO.ProductDAO;

@Configuration
public class JDBCConfiguration {
	
	@Bean
	public DataSource getMySqlDataSource() {
		String url = "jdbc:mysql://localhost:3306/fseTraining";
		String username = "root";
		String password = "root";
		DriverManagerDataSource dataSource = new DriverManagerDataSource(url, username, password);
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return dataSource;
		
	}
	
	@Bean
	public JdbcTemplate geJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getMySqlDataSource());
		return jdbcTemplate;
	}
	
	@Bean
	public EmployeeDAO employeeDAO() {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		return employeeDAO;
	}
	
	@Bean 
	public ProductDAO productDAO() {
		ProductDAO productDAO = new ProductDAO();
		return productDAO;
	}

}
