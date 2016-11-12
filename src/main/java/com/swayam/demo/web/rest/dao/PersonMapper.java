package com.swayam.demo.web.rest.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.swayam.demo.web.rest.model.Person;;

public class PersonMapper implements RowMapper<Person> {
	@Override
	public Person mapRow(ResultSet resultSet, int row) throws SQLException {
		Person person = new Person();
		person.setPid(resultSet.getInt("P_Id"));
		person.setFirstname(resultSet.getString("FirstName"));
		person.setLastname(resultSet.getString("LastName"));
		person.setAddress(resultSet.getString("Address"));
		person.setCity(resultSet.getString("City"));
		return person;

	}

}
