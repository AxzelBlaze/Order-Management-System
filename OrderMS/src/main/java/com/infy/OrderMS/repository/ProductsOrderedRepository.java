package com.infy.OrderMS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.OrderMS.entity.OrderPK;
import com.infy.OrderMS.entity.ProductsOrdered;

public interface ProductsOrderedRepository extends JpaRepository<ProductsOrdered,OrderPK> {
	
	List<ProductsOrdered> getByKey(OrderPK orderPk);

}
