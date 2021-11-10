package com.learn.SpringMVCdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.SpringMVCdemo.dao.DepartmentDao;
import com.learn.SpringMVCdemo.model.Department;

@Service
public class DepartmentService {

	@Autowired
	DepartmentDao departmentDao;

	public List<Department> getAllDepartment() {
		return departmentDao.getAllDepartment();
	}

	public Department getDepartmentById(int id) {
		return departmentDao.getDepartmentById(id);
	}

	public boolean deleteDepartment(int id) {
		return departmentDao.deleteDepartment(id);
	}

	public boolean updateDepartment(Department dept) {
		return departmentDao.updateDepartment(dept);
	}

	public boolean addDepartment(Department dept) throws IdAlreadyExistException{
		Department department = departmentDao.getDepartmentById(dept.getDepartmentId());
		boolean res=true;
		if(department == null) {
			res = departmentDao.addDepartment(dept);
		}
		else {
			throw new IdAlreadyExistException("Id Already Exist");
		}
	return res;
	}

}

