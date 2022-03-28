package com.aut.Test;

import com.aut.Service.BookService;
import com.aut.join.Book;
import com.aut.uilt.test;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(test.class);
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setId(10);
        book.setAge(18);
        book.setName("java");
        bookService.addBook(book);


    }
}
