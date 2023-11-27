package com.example.clothstoredatabase.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.clothstoredatabase.Entity.Product;
import com.example.clothstoredatabase.Exception.ResourceNotFoundException;
import com.example.clothstoredatabase.Repository.ProductRepo;
import com.example.clothstoredatabase.Service.ProductService;
@Service
public class ProductServiceimpl implements ProductService {

	@Autowired
	ProductRepo productrepo;
	@Override
	public Product addproduct(Product product) {
		// TODO Auto-generated method stub
		return productrepo.save(product);
	}

	@Override
	public Product updateproduct(String prodname, Product product) {
		// TODO Auto-generated method stub
		Product s1 = productrepo.findByName(prodname);
			
			if(s1!=null) {
				   
				s1.setProddesc(product.getProddesc());;// old to new set
				s1.setProdlink(product.getProdlink());;
			return productrepo.save(s1);
			} 
			else 
			{
				throw new ResourceNotFoundException();
			} 
	}

	@Override
	public void deleteproduct(String prodname) {
		// TODO Auto-generated method stub
		
Product s2 = productrepo.findByName(prodname);
		
		if(s2!=null) {
			productrepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}
	}
	
	
	

}
