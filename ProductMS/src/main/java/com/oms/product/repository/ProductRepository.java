package com.oms.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oms.product.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
