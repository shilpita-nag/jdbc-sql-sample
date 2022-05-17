package com.sample.student.repo;

import com.sample.student.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int save(Student student) {
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate).withTableName("STUDENT");
        Map<String,Object> insertParameters = new HashMap<>();
        insertParameters.put("name",student.getName());
        insertParameters.put("dept",student.getDept());
        insertParameters.put("roll",student.getRoll());
        return simpleJdbcInsert.execute(insertParameters);
    }

    public List<Student> findAll() {
        return jdbcTemplate.query("select * from student",this::mapRowToEmployee);
    }

    private Student mapRowToEmployee(ResultSet resultSet, int rowNum) throws SQLException {
        return Student.builder()
                .id(resultSet.getLong("id"))
                .name(resultSet.getString("name"))
                .dept(resultSet.getString("dept"))
                .roll(resultSet.getString("roll"))
                .build();
    }
}
