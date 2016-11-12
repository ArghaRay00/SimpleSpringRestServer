package com.swayam.demo.web.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.swayam.demo.web.rest.model.Person;
import com.swayam.demo.web.rest.service.PersonService;

@RestController
public class SimplePersonDetailRestController {

	private final PersonService PersonService;

	@Autowired
	public SimplePersonDetailRestController(PersonService PersonService) {
		this.PersonService = PersonService;
	}

	@RequestMapping(path = { "/person-detail" }, method = { RequestMethod.GET, RequestMethod.POST })
	public List<Person> getAllPersons() {
		return PersonService.getAllPersons();
	}

}
