package org.example.dockerproject2students.service;


import org.example.dockerproject2students.dao.StudentRepository;
import org.example.dockerproject2students.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class StudentData implements CommandLineRunner {


    private StudentRepository repository;


    @Autowired
    public StudentData(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.saveAll(generateStudents());
    }


    private List<Student> generateStudents(){
        List<Student> students = new ArrayList<>();
        Random random = new Random();
        String[] names = {"Ella Fitzgerald", "Milo Thatch", "Hermione Granger", "Harry Potter", "Jon Snow", "Daenerys Targaryen",
                "Tony Stark", "Bruce Wayne", "Clark Kent", "Diana Prince", "Peter Parker", "Bruce Banner",
                "Wade Wilson", "Steve Rogers", "Natasha Romanoff", "Loki Laufeyson", "Thor Odinson",
                "Anakin Skywalker", "Leia Organa", "Luke Skywalker"};

        for(int i=0;i<20;i++){
            DecimalFormat df = new DecimalFormat("#.####");
            double fees = Double.parseDouble(df.format(1000.00+ (random.nextDouble() * 500.00)));
            students.add(new Student(names[i],fees));
        }
        return students;
    }
}
