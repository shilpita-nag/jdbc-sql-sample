package com.sample.student.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    private long id;
    private String name;
    private String dept;
    private String roll;
}
