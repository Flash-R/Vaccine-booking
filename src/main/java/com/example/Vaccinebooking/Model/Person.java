package com.example.Vaccinebooking.Model;

import com.example.Vaccinebooking.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@RequestMapping("/person")
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

}
