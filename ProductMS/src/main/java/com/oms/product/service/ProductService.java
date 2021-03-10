package com.oms.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.oms.product.dto.ProductDTO;
import com.oms.product.product.entity.Product;
import com.oms.product.repository.ProductRepository;


public class ProductService {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ProductRepository prodRepo;
	
	public List<ProductDTO> getAllProducts() {

		List<Product> products = prodRepo.findAll();
		List<ProductDTO> productDTOs = new ArrayList<ProductDTO>();

		for (Product prod : products) {
			ProductDTO productDTO = ProductDTO.valueOf(prod);
			productDTOs.add(productDTO);
		}

		logger.info("======Product details : {}======", productDTOs);
		return productDTOs;
	}
	
	public ProductDTO getProductById(long prodId) {
		logger.info("======Product details : {}======", prodId);
		ProductDTO prodDTO = null;
		Optional<Product> optProduct = prodRepo.findById(prodId);
		if (optProduct.isPresent()) {
			Product product = optProduct.get();
			prodDTO = ProductDTO.valueOf(product);
		}

		return prodDTO;

	}
	
	public void saveProduct(ProductDTO prodDTO) {
		logger.info("======Product Creation Request for data {}======", prodDTO);
		Product product = prodDTO.createProduct();
		prodRepo.save(product);
	}
	
	public void deleteProductById(Long productId) {
		logger.info("======Product Deletion Request for product with ID{}======", productId);
		prodRepo.deleteById(productId);
	}
}
