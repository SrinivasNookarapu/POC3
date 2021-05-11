package com.ojas.poc3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.poc3.model.Person;

@Repository
public interface SudentRepo extends JpaRepository<Person, Integer> {
	
}
