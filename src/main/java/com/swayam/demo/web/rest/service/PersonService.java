package com.swayam.demo.web.rest.service;

import java.util.List;

import com.swayam.demo.web.rest.model.Person;

public interface PersonService {
	List<Person> getAllPersons();

	void saveDetails(Person p);

	Person getPerson(int id);

	boolean doesPidExist(int pid);

	void updateRecord(Person p);

	void deleteRecord(int pid);

}
