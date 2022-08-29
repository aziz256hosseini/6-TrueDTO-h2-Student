package org.example.TestDatabaseDTOconnection;

import lombok.AllArgsConstructor;
import org.example.TestDatabaseDTOconnection.model.Student;
import org.example.TestDatabaseDTOconnection.dto.StudentMapper;
import org.example.TestDatabaseDTOconnection.dto.StudentDTO;
import org.example.TestDatabaseDTOconnection.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/student")
public class Controller {

    private final StudentService studentService;
    private final StudentMapper studentMapper;


    @PostMapping("/v1")
    public ResponseEntity<Void> saveNew(@RequestBody StudentDTO studentDTO) {

        Student student = studentMapper.toEntity(studentDTO);

        studentService.save(student);

        return ResponseEntity.status(HttpStatus.CREATED).build();

    }


    @GetMapping("/v1/{id}")
    public ResponseEntity<StudentDTO> getById(@PathVariable Long id) {

        Student student = studentService.getById(id);

        StudentDTO studentDTO = studentMapper.toDTO(student);

        return ResponseEntity.ok(studentDTO);

    }


    @GetMapping("/v1")
    public ResponseEntity<List<StudentDTO>> getAll() {

        List<Student> students = studentService.getAll();

        List<StudentDTO> studentDTOS = studentMapper.toDTOS(students);

        return ResponseEntity.ok(studentDTOS);

    }


}