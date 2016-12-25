package com.journaldev.spring.service;

import java.util.List;

import com.journaldev.spring.model.Person;

public interface PersonService {

	public void addPerson(Person person);
	public void updatePerson(Person person);
	public List<Person> findAll();
	public Person getPersonById(Integer persionId);
	public void removePerson(Integer persionId);
	
}
