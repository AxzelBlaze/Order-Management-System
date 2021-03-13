package com.infosys.infytel.friend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infytel.friend.entity.OrderKeyID;
import com.infosys.infytel.friend.entity.ProductOrdered;

public interface ProductsOrderedRepository extends JpaRepository<ProductOrdered, OrderKeyID> {

	List<ProductOrdered> findByIdOrderId(int orderId);
	
	List<ProductOrdered> findByIdProdId(int prodId);
}
