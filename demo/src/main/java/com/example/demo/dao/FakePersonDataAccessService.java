package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

// this tells Spring that this class needs to be established,
// so we can inject into other classes. fakeDao allows multiple implementations
@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao {

    private static List<Person> DB = new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        // inserting person into database
        DB.add(new Person(id, person.getName()));
        return 1;
    }
    // retrieve info
    public List<Person> selectAllPeople() {
        return DB;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return DB.stream()
                // checks if there is a person with that actual id
                .filter(person -> person.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deletePersonById(UUID id) {
        Optional<Person> personMaybe = selectPersonById(id);
        if (personMaybe.isEmpty()) {
            return 0;
        }
        DB.remove(personMaybe.get());
        return 1;
    }

    @Override
    public int updatePersonById(UUID id, Person update) {
        return selectPersonById(id)
                .map(person -> {
                    int indexOfPersonToUpdate = DB.indexOf(person); // creating temp variable
                    if (indexOfPersonToUpdate >= 0) { // if indexOfPersonToDelete is greater than 0 we found someone
                        DB.set(indexOfPersonToUpdate, new Person(id, update.getName()));
                        return 1;
                    } return 0; // if 0 is returned something wrong happened
                })
                .orElse(0); // if nothing is present of selectPersonById, returns 0
    }
}
