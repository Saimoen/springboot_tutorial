package com.springtutorial.tutorial.dao;

import com.springtutorial.tutorial.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPeopleById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);
}
