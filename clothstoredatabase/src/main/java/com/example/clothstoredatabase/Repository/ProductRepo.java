package com.example.clothstoredatabase.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.clothstoredatabase.Entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	@Query(value =  "select * from Product where prodname =?" , nativeQuery = true)
	Product findByName(String prodname);
}
