package com.example.sales.service;

import java.util.List;
import java.util.Optional;

import com.example.sales.model.Product;

public interface ProductService {

	List<Product> getAll();

	Optional<Product> getById(Integer id);

	void save(Product product);

	void update(Product product);

	void deleteById(Integer id);
	
}
