package com.infosys.infytel.friend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infytel.friend.entity.ProductOrdered;

public interface ProductsOrderedRepository extends JpaRepository<ProductOrdered, Integer> {

}
