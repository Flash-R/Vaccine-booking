package com.example.Vaccinebooking.Controller;

import com.example.Vaccinebooking.Model.Person;
import com.example.Vaccinebooking.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping("/add")
    public ResponseEntity addPerson(@RequestBody Person person){
        try{
            Person person1 = personService.addPerson(person);
            return new ResponseEntity(person1, HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity("Person not saved Please check your values", HttpStatus.NOT_FOUND);
        }

    }
}
