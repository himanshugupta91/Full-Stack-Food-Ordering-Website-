package com.codeStorm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeStorm.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
