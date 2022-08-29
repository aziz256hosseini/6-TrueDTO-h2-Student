package org.example.TestDatabaseDTOconnection.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Student {


    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    Long id;

    @Column
    int age;

    @Column
    String name;



}
