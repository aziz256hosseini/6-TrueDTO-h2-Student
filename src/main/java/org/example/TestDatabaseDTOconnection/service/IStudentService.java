package org.example.TestDatabaseDTOconnection.service;

import org.example.TestDatabaseDTOconnection.dto.StudentDTO;
import org.example.TestDatabaseDTOconnection.entity.Student;

import java.util.List;

public interface IStudentService {


    Student save (Student student);
    Student getById (Long id);
    List <Student> getAll ();

    Student saveDTO (StudentDTO studentDTO);


}