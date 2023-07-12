package com.example.Vaccinebooking.Service;

import com.example.Vaccinebooking.Model.Person;
import com.example.Vaccinebooking.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;
    public Person addPerson(Person person) {
        person.setDose1Taken(false);
        person.setDose2taken(false);

        Person personSaved = personRepository.save(person);
        return personSaved;
    }
}
