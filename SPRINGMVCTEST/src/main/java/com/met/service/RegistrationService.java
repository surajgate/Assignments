package com.met.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.met.dao.RegistrationDAO;
import com.met.model.Registration;

//@Component
@Service
public class RegistrationService {

	
	@Autowired
	private RegistrationDAO registrationDAO;
	
	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	public void save(Registration registration) {
	

		if(registration.getEmailId() == null) {
			throw new RuntimeException("Email ID cannot be NUll");
		}
		
		System.out.println("RegistrationService :: save");	
		registrationDAO.save(registration);
		
		
		
		System.out.println("Registration DAO class: " + registrationDAO.getClass());
		
	}
	
	
	public  Collection<Registration> getAllUsers(){
		
		return registrationDAO.getAllUsers();
		
	}
	
	
}
