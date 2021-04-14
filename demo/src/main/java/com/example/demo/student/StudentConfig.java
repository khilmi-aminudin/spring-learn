package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
             StudentRepository repository){
        return args -> {
            Student khilmi = new Student(
                    "Khilmi Aminudin",
                    "khilmi@aminudin.com",
                    LocalDate.of(1998, Month.JULY , 15)
            );
            Student fathi = new Student(
                    "Fathi Risqullah",
                    "fathi@risqullah.com",
                    LocalDate.of(2012, Month.APRIL , 13)
            );
            Student faza = new Student(
                    "Muhammad Rayyan Mafazza",
                    "fazza@gmail.com",
                    LocalDate.of(2016, Month.APRIL , 13)
            );

            repository.saveAll(
                    List.of(khilmi,fathi,faza)
            );
        };
    }
}
