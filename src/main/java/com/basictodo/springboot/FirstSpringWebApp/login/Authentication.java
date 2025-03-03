package com.basictodo.springboot.FirstSpringWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class Authentication {
    public boolean  authenticate(String username,String password){
            boolean validusername = username.equalsIgnoreCase("Rudra");
            boolean validpassword = password.equalsIgnoreCase("Silky");

            return validusername && validpassword;
    }
}
