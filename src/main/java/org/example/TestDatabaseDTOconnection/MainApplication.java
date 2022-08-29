package org.example.TestDatabaseDTOconnection;

import org.example.TestDatabaseDTOconnection.entity.Student;
import org.example.TestDatabaseDTOconnection.repository.IStudentRepository;
import org.example.TestDatabaseDTOconnection.service.IStudentService;
import org.example.TestDatabaseDTOconnection.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication implements ApplicationRunner{

    @Autowired
    IStudentRepository iStudentRepository;
    @Autowired
    StudentService studentService;
    @Autowired
    IStudentService iStudentService;


    public static void main(String[] args) {

        SpringApplication.run(MainApplication.class);

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Student student1 = new Student();
        student1.setAge(16);
        student1.setName("Aziz Hoseini");

        Student savedStudent = iStudentService.save(student1);


    }
}
