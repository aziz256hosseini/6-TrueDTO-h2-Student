package org.example.TestDatabaseDTOconnection.dto;


import org.example.TestDatabaseDTOconnection.model.Student;
import org.mapstruct.Mapper;
import java.util.List;


@Mapper (componentModel = "spring")
public interface StudentMapper {

    Student toEntity (StudentDTO studentDTO);
    StudentDTO toDTO (Student student);

    List<Student> toEntities (List <StudentDTO> studentDTOS);
    List<StudentDTO> toDTOS (List <Student> students);

}