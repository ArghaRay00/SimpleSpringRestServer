package com.swayam.demo.web.rest.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.swayam.demo.web.rest.model.Person;
import com.swayam.demo.web.rest.service.PersonService;

@Controller
public class SimpleFormController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SimpleFormController.class);

	private final PersonService personService;

	@Autowired
	public SimpleFormController(PersonService personService) {
		this.personService = personService;
	}

	@RequestMapping(path = { "/personform.html" }, method = { RequestMethod.GET })

	public ModelAndView viewForm(@RequestParam(name = "id", required = false) Integer id) {
		LOGGER.debug("person ID is {}", id);
		if (id == null) {
			Map<String, Object> userObjects = new HashMap<>();
			Person p = new Person();
			userObjects.put("command", p);
			return new ModelAndView("Simpleform", userObjects);
		}

		Person reqDetail = personService.getPerson(id);
		Map<String, Object> userObjects = new HashMap<>();
		userObjects.put("command", reqDetail);
		return new ModelAndView("Simpleform", userObjects);

	}

	@RequestMapping(path = { "/handlePostedForm" }, method = { RequestMethod.POST })
	public ModelAndView handlePostedForm(@ModelAttribute Person p) {
		LOGGER.debug("person from the form is {}", p);
		personService.saveDetails(p);
		Map<String, Object> userObjects = new HashMap<>();
		userObjects.put("command", p);
		return new ModelAndView("Simpleform", userObjects);

	}

}
