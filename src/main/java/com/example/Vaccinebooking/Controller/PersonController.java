package com.example.Vaccinebooking.Controller;

import com.example.Vaccinebooking.Model.Person;
import com.example.Vaccinebooking.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;
    public ResponseEntity addPerson(Person person){
        Person person1 = personService.addPerson(person);
        return new ResponseEntity<>(person1, HttpStatus.CREATED);
    }
}
