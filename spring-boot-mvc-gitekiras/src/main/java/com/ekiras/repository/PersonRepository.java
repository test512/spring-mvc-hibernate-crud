package com.ekiras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ekiras.domain.Person;


public interface PersonRepository extends JpaRepository<Person,Long> {

}
