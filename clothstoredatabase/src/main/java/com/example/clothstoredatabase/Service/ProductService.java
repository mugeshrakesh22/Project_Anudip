package com.example.clothstoredatabase.Service;

import com.example.clothstoredatabase.Entity.Product;

public interface ProductService {

	Product addproduct(Product product);
	
	Product updateproduct(String prodname, Product product);
	
	void deleteproduct(String prodname);
}
