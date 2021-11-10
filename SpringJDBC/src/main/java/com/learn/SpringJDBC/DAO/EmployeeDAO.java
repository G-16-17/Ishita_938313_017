package com.learn.SpringJDBC.DAO;

//import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.learn.SpringJDBC.model.Employee;

public class EmployeeDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Employee> getAllEmployee(){
		System.out.println("*");
		List<Employee> employeeList=jdbcTemplate.query("select * from emp", new ResultSetExtractor<List<Employee>>() {

			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> empList=new ArrayList<Employee>();
				while(rs.next()) {
					int empno=rs.getInt("empno");
					String name=rs.getString("ename");
					String job=rs.getString("job");
					int salary=rs.getInt("sal");
					int comm=rs.getInt("comm");
					int deptno=rs.getInt("deptno");
					int mgr=rs.getInt("mgr");
					java.sql.Date d1 = rs.getDate("hiredate");
					LocalDate date=(d1==null)?null:d1.toLocalDate();
					Employee emp= new Employee(empno, name, job, salary,date,mgr,comm,deptno);
					empList.add(emp);
				}
				return empList;
			}
			
		});
		return employeeList;
	}
	
	public Map<Integer, List<Employee>> getEmployeeDetail(){
		Map<Integer, List<Employee>> employeeMap=jdbcTemplate.query("select * from emp", new ResultSetExtractor<Map<Integer,List<Employee>>>(){

			@Override
			public Map<Integer, List<Employee>> extractData(ResultSet rs) throws SQLException, DataAccessException {
				Map<Integer,List<Employee>> empMap=new HashMap<Integer, List<Employee>>();
				while(rs.next()) {
					int empno=rs.getInt("empno");
					String name=rs.getString("ename");
					String job=rs.getString("job");
					int salary=rs.getInt("sal");
					int comm=rs.getInt("comm");
					int deptno=rs.getInt("deptno");
					int mgr=rs.getInt("mgr");
					java.sql.Date d1=rs.getDate("hiredate");
					LocalDate date=(d1==null)?null:d1.toLocalDate();
					Employee emp= new Employee(empno, name, job, salary,date,mgr,comm,deptno);
					if(empMap.containsKey(deptno)) {
						List<Employee> employeeList=empMap.get(deptno);
						employeeList.add(emp);
					}
					else {
						List<Employee> employeeList=new ArrayList<Employee>();
						employeeList.add(emp);
						empMap.put(deptno, employeeList);
					}
				}
				return empMap;
			}
			
		});
		return employeeMap;
	}

}
