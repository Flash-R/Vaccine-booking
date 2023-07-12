package com.example.Vaccinebooking.Model;

import com.example.Vaccinebooking.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
@Getter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    int age;

    @Column(unique = true)
    String email;

    @Enumerated(EnumType.STRING)
    Gender gender;

    boolean isDose1Taken;

    boolean isDose2taken;

//    @OneToMany(mappedBy = "person",cascade = CascadeType.ALL)
//    List<Dose> doses = new ArrayList<>();
//
//    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
//    Certificate certificate;
}
