package com.swayam.demo.web.rest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.swayam.demo.web.rest.model.Person;
import com.swayam.demo.web.rest.service.PersonService;

@Controller
public class PersonDetailController {
	private final PersonService personService;

	@Autowired
	public PersonDetailController(PersonService personService) {
		this.personService = personService;
	}

	@RequestMapping(path = { "/personlist.html" }, method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView handlepersonDetail() {

		List<Person> persons = personService.getAllPersons();

		Map<String, Object> pmap = new HashMap<>();
		pmap.put("persons", persons);
		return new ModelAndView("personList", pmap);
	}
}
