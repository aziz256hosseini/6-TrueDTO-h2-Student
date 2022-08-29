package org.example.TestDatabaseDTOconnection.repository;


import org.example.TestDatabaseDTOconnection.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student, Long> {



}
