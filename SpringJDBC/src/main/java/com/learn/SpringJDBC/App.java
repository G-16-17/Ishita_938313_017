package com.learn.SpringJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.SpringJDBC.DAO.DepartmentDAO;
//import com.learn.SpringJDBC.model.Department;
import com.learn.SpringJDBC.model.Dept;
//import com.learn.SpringJDBC.model.Product;
import com.learn.SpringJDBC.DAO.ProductDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("AppContext.xml");
        DepartmentDAO deptDao = context.getBean("departmentDAO",DepartmentDAO.class);
        
        //List<Department> deptList = deptDao.getAllDepartment();
        //deptList.forEach(System.out::println);
        
        //List<Dept> departmentList = deptDao.getDepartments();
        //departmentList.forEach(System.out::println);
    
        ProductDAO productDAO = context.getBean("productDAO",ProductDAO.class);
        productDAO.getAllProduct().forEach(System.out::println);

    }
}
