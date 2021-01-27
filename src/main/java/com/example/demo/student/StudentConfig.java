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
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student sana = new Student(
                    "Sana",
                    "sana.hwang@gmail.com",
                    LocalDate.of(1995, Month.APRIL, 5));

            Student jasmine = new Student(
                    "Jasmine",
                    "jasmine.smith@gmail.com",
                    LocalDate.of(2000, Month.DECEMBER, 23));

            repository.saveAll(List.of(sana, jasmine));
        };
    }
}
