package org.example.TestDatabaseDTOconnection.service;

import org.example.TestDatabaseDTOconnection.model.Student;
import java.util.List;

public interface IStudentService {


    Student save (Student student);
    Student getById (Long id);
    List <Student> getAll ();


}