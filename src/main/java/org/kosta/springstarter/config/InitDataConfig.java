package org.kosta.springstarter.config;

import org.kosta.springstarter.entity.Book;
import org.kosta.springstarter.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InitDataConfig implements CommandLineRunner {

    @Autowired
    private BookService bookService;

    @Override
    public void run(String... args) throws Exception {
        List<Book> books = bookService.getAll();
        if (books == null || books.isEmpty()) {
            Book book1 = new Book();
            book1.setSubject("스프링부트");
            book1.setPrice(30000);
            book1.setAuthor("이순신");
            book1.setPage(600);
            bookService.save(book1);

            Book book2 = new Book();
            book2.setSubject("파이썬");
            book2.setPrice(37000);
            book2.setAuthor("신사임당");
            book2.setPage(800);
            bookService.save(book2);
        }
    }
}
