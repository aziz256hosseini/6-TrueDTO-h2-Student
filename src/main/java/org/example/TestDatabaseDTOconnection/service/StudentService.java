package org.example.TestDatabaseDTOconnection.service;


import lombok.AllArgsConstructor;
import org.example.TestDatabaseDTOconnection.model.Student;
import org.example.TestDatabaseDTOconnection.repository.IStudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class StudentService implements IStudentService{

    private IStudentRepository studentRepository;


    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getById(Long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isEmpty()){
            throw new RuntimeException("Not Found");
        }
        return optionalStudent.get();
    }

    @Override
    public List<Student> getAll() {
        return (List<Student>) studentRepository.findAll();
    }
}