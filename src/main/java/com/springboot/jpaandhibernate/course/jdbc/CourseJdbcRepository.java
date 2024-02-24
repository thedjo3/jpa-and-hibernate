package com.springboot.jpaandhibernate.course.jdbc;

import com.springboot.jpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



// Annotation in Spring when class talks to a database is @Repository
@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INTERT_QUERY =
            """
                insert into course (id, name, author)
                values(?, ?, ?);
            """;
    private static String DELETE_QUERY =
            """
                delete from course
                where id = ?
            """;

    public void insert(Course course) {
        springJdbcTemplate.update(INTERT_QUERY, course.getId(), course.getName(), course.getAuthor());
        //springJdbcTemplate.update(DELETE_QUERY, course.getId());
    }

    public void delete(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }
}
