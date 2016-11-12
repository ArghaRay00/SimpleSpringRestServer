package com.swayam.demo.web.rest.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.swayam.demo.web.rest.model.Person;

@Repository
public class PersonDaoImpl implements PersonDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(PersonDaoImpl.class);

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public PersonDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Person> getAllPersons() {
		return jdbcTemplate.query("select * from Persons", new PersonMapper());
	}

	@Override
	public void saveDetails(Person p) {
		LOGGER.debug("person from the form is {}", p);

		String sql = "insert into Persons (P_Id, LastName, FirstName, Address, City) values(?,?,?,?,?)";
		int rows = jdbcTemplate.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement stat) throws SQLException {
				LOGGER.debug("inside {}", p);

				stat.setInt(1, p.getPid());
				stat.setString(2, p.getLastname());
				stat.setString(3, p.getFirstname());
				stat.setString(4, p.getAddress());
				stat.setString(5, p.getCity());

			}
		});

		LOGGER.debug("rows affected is {}", rows);

	}

	@Override
	public Person getPerson(int id) {
		String sql = "select * from Persons where P_Id=?";
		List<Person> persons = jdbcTemplate.query(sql, new Object[] { id }, new PersonMapper());
		return persons.get(0);
	}
}
