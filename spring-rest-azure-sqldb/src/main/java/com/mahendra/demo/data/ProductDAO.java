package com.mahendra.demo.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mahendra.demo.models.Product;

@RepositoryRestResource(path="products")
public interface ProductDAO extends CrudRepository<Product, Integer>{
	Product findByProductId(@Param("productId") Integer productId);
}
