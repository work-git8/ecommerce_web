package com.work.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.work.model.Address;

public interface AddressRepository extends JpaRepository<Address,Long>{

	
}
