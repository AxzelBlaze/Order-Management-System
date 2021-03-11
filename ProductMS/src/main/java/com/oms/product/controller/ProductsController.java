package com.oms.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oms.product.dto.ProductDTO;
import com.oms.product.service.ProductService;

@RestController
@CrossOrigin
public class ProductsController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ProductService productService;
	
	@GetMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductDTO> getAllProducts() {
		logger.info("Fetching all products");
		return productService.getAllProducts();
	}
	
	@GetMapping(value = "/products/{productId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductDTO getProductDetails(@PathVariable Long productId) {
		logger.info("===Fetching details of product {}", productId);
		return productService.getProductById(productId);
	}

	@PostMapping(value = "/seller/{sellerId}/add",  consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addProduct(@PathVariable Long sellerId, @RequestBody ProductDTO productDTO) {
		logger.info("======Product Creation request for seller {} with product {}", sellerId, productDTO);
		productService.addProduct(sellerId, productDTO);
	}
	
	
}
