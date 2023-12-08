package com.work.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.work.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{

	@Query("Select c From Cart c Where c.user.Id=:userId")
	public Cart findByUserId(@Param("userId")Long userId);

	
}
