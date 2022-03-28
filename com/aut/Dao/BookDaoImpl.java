package com.aut.Dao;

import com.aut.join.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {

        String sql = "insert into test(id,age,name) values(?,?,?)";
        jdbcTemplate.update(sql,book.getId(),book.getAge(),book.getName());
    }
}
