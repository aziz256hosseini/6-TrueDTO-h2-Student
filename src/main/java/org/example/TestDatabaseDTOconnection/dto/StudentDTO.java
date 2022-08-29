package org.example.TestDatabaseDTOconnection.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class StudentDTO{

    @ApiModelProperty(required = true)
    int age;

    @ApiModelProperty(required = true)
    String name;

}