package com.learn.SpringMVCdemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.learn.SpringMVCdemo.model.Department;

@Component
public class DepartmentDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Department> getAllDepartment(){
		String query="select deptno departmentId, dname as departmentName,loc location from dept";
		List <Department> deptList=jdbcTemplate.query(query,new BeanPropertyRowMapper(Department.class));
		return deptList;
	}
	public Department getDepartmentById(int id) {
		String query="select deptno departmentId, dname as departmentName,loc location from dept where deptno=?";
		Department department;
		try {
		department=jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<Department>(Department.class),new Object[] {id});
		}
		catch(EmptyResultDataAccessException e) {
			department=null;
		}
		return department;
	}
	public boolean deleteDepartment(int id) {
		String query="delete from dept where deptno=?";
		int n=jdbcTemplate.update(query,id);
		return n>0;
	}
	public boolean updateDepartment(Department dept) {
		String query="update dept set dname=?, loc=? where deptno=?";
		int n=jdbcTemplate.update(query,new Object[] {dept.getDepartmentName(),dept.getLocation(),dept.getDepartmentId()});
		return n>0;
	}
	public boolean addDepartment(Department dept) {
		String query="insert into dept values(?,?,?)";
		int n=jdbcTemplate.update(query,new Object[] {dept.getDepartmentId(),dept.getDepartmentName(),dept.getLocation()});
		return n>0;
	}


	}