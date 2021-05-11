package com.ojas.poc3.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.poc3.dao.SudentRepo;
import com.ojas.poc3.model.Person;

@RestController
public class PersonController {

	
	@Autowired
	private SudentRepo dao;
	
	
	@PostMapping("/addperson")
	public Person addPerson(@RequestBody Person person) {
		return dao.save(person);
	}
	
	@GetMapping("/getpersons")
	public Iterable<Person> getPersons(){
		return dao.findAll();
	}
	
	@GetMapping("/getperson/{id}")
	public Optional<Person> getperson(@PathVariable Integer id){
		return dao.findById(id);
	}
	
	@DeleteMapping("/getperson/{id}")
	public void deleteperson(@PathVariable Integer id){
		dao.deleteById(id);
	}
	
	
}
