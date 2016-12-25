package com.journaldev.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.journaldev.spring.model.Person;
import com.journaldev.spring.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	@Transactional
	public void addPerson(Person person) {
		personRepository.save(person);
	}

	@Override
	@Transactional
	public void updatePerson(Person person) {
		Person p = personRepository.findByPersonId(person.getPersonId());
		p.setCountry(person.getCountry());
		p.setName(person.getName());

		personRepository.save(p);
	}

	@Override
	@Transactional
	public List<Person> findAll() {
		return personRepository.findAll();
	}

	@Override
	@Transactional
	public Person getPersonById(Integer id) {
		return personRepository.findByPersonId(id);
	}

	@Override
	@Transactional
	public void removePerson(Integer id) {
		Person person = personRepository.findByPersonId(id);
		personRepository.delete(person);
	}
}
