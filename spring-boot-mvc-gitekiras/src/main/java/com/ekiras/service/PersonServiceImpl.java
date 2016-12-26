package com.ekiras.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ekiras.domain.Person;
import com.ekiras.repository.PersonRepository;


@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonRepository personRepository; 
	
	@Override
	public Object findAll() {
		return personRepository.findAll();
	}

	@Override
	public Person findById(Long id) {
		return personRepository.findOne(id);
	}

	@Override
	public Person save(Person person) {
		return personRepository.save(person);
	}

	@Override
	public void delete(Person person) {
		personRepository.delete(person);
	}

}
