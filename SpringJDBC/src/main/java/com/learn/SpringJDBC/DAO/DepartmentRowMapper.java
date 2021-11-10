package com.learn.SpringJDBC.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.learn.SpringJDBC.model.Department;

public class DepartmentRowMapper implements RowMapper<Department> {
	
	@Override
	public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		int deptId = rs.getInt("deptno");
		String name = rs.getString("dname");
		String loc = rs.getString("loc");
		
		Department dept = new Department(deptId, name, loc);
		return dept;
	}
}
