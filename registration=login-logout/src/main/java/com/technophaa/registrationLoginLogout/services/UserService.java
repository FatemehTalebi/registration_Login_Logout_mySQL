package com.technophaa.registrationLoginLogout.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.technophaa.registrationLoginLogout.models.User;
import com.technophaa.registrationLoginLogout.web.dto.UserRegistrationDto;

public interface UserService  extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
	
	     
	
	         
	    }
