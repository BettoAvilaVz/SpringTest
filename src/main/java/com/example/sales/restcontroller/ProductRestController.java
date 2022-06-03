package com.example.sales.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sales.model.Product;
import com.example.sales.service.ProductService;

@RestController
@RequestMapping("/rest/api/v1/products")
public class ProductRestController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public List<Product> getAll() {
		return productService.getAll();
	}
	
	@PostMapping
	public void create(@RequestBody Product product) {
		productService.save(product);
	}

}
