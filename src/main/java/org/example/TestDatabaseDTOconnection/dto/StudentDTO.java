package org.example.TestDatabaseDTOconnection.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Data
public class StudentDTO{

    @ApiModelProperty(required = true)
    int age;

    @ApiModelProperty(required = true)
    String name;

    @CreationTimestamp
    private Date created_at;

}