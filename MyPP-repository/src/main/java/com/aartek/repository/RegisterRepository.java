package com.aartek.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.RegistrationDto;

@Repository
public class RegisterRepository {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public RegistrationDto saveUser(RegistrationDto reg) {
		System.out.println("inside Repository method..");
		System.out.println("FName : " + reg.getFirstName() + ", lName : " + reg.getLastName());
		hibernateTemplate.save(reg);
		return reg;

	}

}
