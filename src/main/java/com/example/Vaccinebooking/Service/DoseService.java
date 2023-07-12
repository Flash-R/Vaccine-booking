package com.example.Vaccinebooking.Service;

import com.example.Vaccinebooking.Enum.DoseType;
import com.example.Vaccinebooking.Model.Dose;
import com.example.Vaccinebooking.Model.Person;
import com.example.Vaccinebooking.Repository.DoseRepository;
import com.example.Vaccinebooking.Repository.PersonRepository;
import com.example.Vaccinebooking.exception.DoseAlreadyTakenException;
import com.example.Vaccinebooking.exception.PersonNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class DoseService {
    @Autowired
    DoseRepository doseRepository;

    @Autowired
    PersonRepository personRepository;


    public Dose getDose1(int personId, DoseType doseType) {
        Optional<Person> optionalPerson = personRepository.findById(personId);
//        check if person exists
        if(!optionalPerson.isPresent()){
            throw new PersonNotFound("Invalid Person");
        }

        Person person = optionalPerson.get();
//check if dose 1 is taken already
        if(person.isDose1Taken()){
            throw new DoseAlreadyTakenException("Already Completed Dose 1");
        }

//        creating the dose object
        Dose dose = new Dose();
        dose.setDoseId(String.valueOf(UUID.randomUUID()));
        dose.setDoseType(doseType);
        dose.setPerson(person);

        person.setDose1Taken(true);
        personRepository.save(person);

        return doseRepository.save(dose);

    }
}
