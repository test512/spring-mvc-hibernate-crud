package com.journaldev.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.journaldev.spring.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

	Person findByPersonId(Integer personId);
}
