package com.example.Vaccinebooking.Repository;

import com.example.Vaccinebooking.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
