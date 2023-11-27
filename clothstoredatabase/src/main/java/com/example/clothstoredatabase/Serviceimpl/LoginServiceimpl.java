package com.example.clothstoredatabase.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.clothstoredatabase.Entity.Login;
import com.example.clothstoredatabase.Exception.ResourceNotFoundException;
import com.example.clothstoredatabase.Repository.LoginRepo;
import com.example.clothstoredatabase.Service.LoginService;

@Service
public class LoginServiceimpl implements LoginService {

	
	@Autowired
	LoginRepo loginrepo;

	@Override
	public Login login(String email, String password) {
		Login s = loginrepo.findByEmail(email);

		if (s != null) {
			if (s.getPassword().equals(password)) {
				return s;
			} else {
				throw new ResourceNotFoundException();
			}
		} else {
			throw new ResourceNotFoundException();
		}

	}

}
