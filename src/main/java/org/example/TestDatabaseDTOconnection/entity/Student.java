package org.example.TestDatabaseDTOconnection.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

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

    @Column
    @CreationTimestamp
    private Date created_at;



}
