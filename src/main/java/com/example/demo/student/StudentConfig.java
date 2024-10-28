package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args -> {
            Student grace = new Student(
                    1L,
                    "Grace",
                    "grace@gmail.com",
                    LocalDate.of(2000, 1, 5),
                    LocalDate.now().getYear() - LocalDate.of(2000, 1, 5).getYear()
            );
            Student alex = new Student(
                    1L,
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1980, 1, 5),
                    LocalDate.now().getYear() - LocalDate.of(2000, 1, 5).getYear()
            );

            repository.saveAll(
                    List.of(grace, alex)
            );
        };
    }
}
