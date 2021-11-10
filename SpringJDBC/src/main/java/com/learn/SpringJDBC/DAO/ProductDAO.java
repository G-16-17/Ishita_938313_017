package com.learn.SpringJDBC.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.learn.SpringJDBC.model.Product;

public class ProductDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public List<Product> getAllProduct() {
		List<Product> productList=jdbcTemplate.query("select * from product", new BeanPropertyRowMapper<Product>(Product.class));
		return productList;
	}
	
	public Product getProduct(int productId) {
		String query ="select * from product where product_id=?";
		
		Product product;
		try {
			product= jdbcTemplate.queryForObject(query, new Object[] { productId }, new BeanPropertyRowMapper<Product>(Product.class));
		}catch (EmptyResultDataAccessException e) {
			// TODO: handle exception
			product=null;
		}
		
		return product; 
	}
	
	public void addProduct(Product product) {
		String query = "insert into product(product_name, price, date_of_manufacture) values(?,?,?)";
		int n = jdbcTemplate.update(query, new Object[] {product.getProductName(), product.getPrice(), product.getDateOfManufacture()});
		
		}
	
	public boolean updateProduct(Product product) {
		String query = "update product set product_name=?, price=? where product_id=?";
		int n = jdbcTemplate.update(query, new Object[] {product.getProductName(), product.getPrice(), product.getDateOfManufacture()});
		return n>0;
		
		}
	
	public boolean deleteProduct(int productId) {
		String query = "delete from product where product_id=?";
		int n = jdbcTemplate.update(query, new Object[] {productId});
		return n>0;
		
		}
	
	
	
}

