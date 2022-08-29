package org.example.TestDatabaseDTOconnection.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import java.util.Date;

@Data
public class StudentDTO{

    @ApiModelProperty(required = true)
    int age;

    @ApiModelProperty(required = true)
    String name;

    @Column
    @CreationTimestamp
    private Date created_at;


}