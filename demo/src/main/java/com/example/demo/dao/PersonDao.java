package com.example.demo.dao;


// import model person
import com.example.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    // defining method
    int insertPerson(UUID id, Person person);
    default int insertPerson(Person person) {
        // UUID (universally unique identifier), 128-bit long value that is unique
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    // retrieve info
    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);
}
