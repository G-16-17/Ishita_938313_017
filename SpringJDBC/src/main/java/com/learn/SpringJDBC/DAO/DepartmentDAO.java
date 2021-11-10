package com.learn.SpringJDBC.DAO;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import com.learn.SpringJDBC.model.Department;
import com.learn.SpringJDBC.model.Dept;

public class DepartmentDAO {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Department> getAllDepartment(){
		String query = "select * from dept";
		
		//List<Department> departmentList= jdbcTemplate.query(query, new DepartmentRowMapper());
		
		//SECOND WAY
		List<Department> departmentList= jdbcTemplate.query(query,(rs,rownum)->{
			int deptId = rs.getInt("deptno");
			String name = rs.getString("dname");
			String loc = rs.getString("loc");
			
			Department dept = new Department(deptId, name, loc);
			return dept;
		});
		
		
		
		return departmentList;
	}
	
	public List<Dept>getDepartments(){
		String query = "select * from dept"; //3 columns, but dept only 2 fields
		
		List<Dept> departmentList= jdbcTemplate.query(query,(rs,rownum)->{
			int deptId = rs.getInt("deptno");
			String name = rs.getString("dname");
			Dept dept = new Dept(deptId, name);
			return dept;
		});
		
		return departmentList;
		
	}
	
	

}
