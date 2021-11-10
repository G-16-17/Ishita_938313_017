package com.learn.SpringJDBC;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.learn.SpringJDBC.DAO.ProductDAO;
import com.learn.SpringJDBC.model.Product;

public class App2 {
	
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(JDBCConfiguration.class);
		ProductDAO productDAO=context.getBean("productDAO", ProductDAO.class);
		
		System.out.println("All Products");
		List<Product> productList=productDAO.getAllProduct();
		productList.forEach(System.out::println);
		
		System.out.println("----------------");
		System.out.println("Get a Product");
		
		Product product = productDAO.getProduct(2);
		System.out.println((product==null)?"Invalid Product Id": product);
		
		System.out.println("-------------");
		System.out.println("Get a Product");
		
		product = productDAO.getProduct(4);
		System.out.println(product==null?"Invalid Product Id" : product);
		
		//Product p1 = new Product("NoteBook-Long-150", 75, new Date());
		//productDAO.addProduct(p1);
		
		System.out.println("-----------------");
		productDAO.getAllProduct().forEach(System.out::println);
		System.out.println("--------------------");
		
		Product p1 = new Product(8, "Notebook-Long-180", 100, null);
		boolean res = productDAO.updateProduct(p1);
		System.out.println((res)?"Updated":"Not Updated");
		
		System.out.println("--------------------");
		productDAO.getAllProduct().forEach(System.out::println);
		System.out.println("------------------");
		
		res = productDAO.deleteProduct(8);
		System.out.println((res)?"Deleted Successfully": "Not deleted");
		System.out.println("------------------");
		productDAO.getAllProduct().forEach(System.out::println);
		System.out.println("---------");
	}

}
