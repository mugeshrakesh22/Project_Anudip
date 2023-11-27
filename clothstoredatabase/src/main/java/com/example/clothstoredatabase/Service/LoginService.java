package com.example.clothstoredatabase.Service;

import com.example.clothstoredatabase.Entity.Login;

public interface LoginService {

	Login login(String email, String password);
}
