package org.kosta.springstarter.service;

import lombok.AllArgsConstructor;
import org.kosta.springstarter.entity.Book;
import org.kosta.springstarter.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor     // 생성자 만들어라
public class BookService {
    //@Autowired
    private final BookRepository bookRepository;    // final로 선언하여 변경 불가함
    /* 생성자 주입방법
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    } */

    // select * from book where id=3
    public Optional<Book> getById(Long id) {
        return bookRepository.findById(id);     // select * from book where id=3;
    }

    public List<Book> getAll() {
        return bookRepository.findAll();    // select * from book;
    }

    public void delete(Book book) {
        bookRepository.delete(book);        // delete from book where id=3;
    }

    public Book save(Book book) {           // insert or update
        if (book.getId() == null) {
            book.setCreatedAt(LocalDateTime.now());
        }
        return bookRepository.save(book);   // insert, update
    }
}
