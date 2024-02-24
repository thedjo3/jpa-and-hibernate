package com.springboot.jpaandhibernate.course.jdbc;

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
                values(1, 'Learn AWS', 'in28minutes');
            """;

    public void insert() {
        springJdbcTemplate.update(INTERT_QUERY);
    }

}
