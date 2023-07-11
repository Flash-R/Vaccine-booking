package com.example.Vaccinebooking.Model;

import com.example.Vaccinebooking.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@RequestMapping("/doctor")
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
@Getter
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    @Column(unique = true)
    String Email;

    int age;

    @Enumerated(EnumType.STRING)
    Gender gender;

    String speciality;
}
