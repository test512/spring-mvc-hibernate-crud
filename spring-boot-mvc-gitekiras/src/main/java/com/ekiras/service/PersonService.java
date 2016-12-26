package com.ekiras.service;

import com.ekiras.domain.Person;

public interface PersonService {

	public Object findAll();
	
	public Person findById(Long id);
	
	public Person save(Person person);
	
	public void delete(Person person);
	
}
