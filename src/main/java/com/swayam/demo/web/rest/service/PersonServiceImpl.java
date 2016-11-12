package com.swayam.demo.web.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swayam.demo.web.rest.dao.PersonDao;
import com.swayam.demo.web.rest.model.Person;;

@Service
public class PersonServiceImpl implements PersonService {

	private final PersonDao personDao;

	@Autowired
	public PersonServiceImpl(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public List<Person> getAllPersons() {
		return personDao.getAllPersons();
	}

	@Override
	public void saveDetails(Person p) {
		personDao.saveDetails(p);

	}
}