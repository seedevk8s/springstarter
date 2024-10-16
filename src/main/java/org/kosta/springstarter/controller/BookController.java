package org.kosta.springstarter.controller;

import org.kosta.springstarter.entity.Book;
import org.kosta.springstarter.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String house() {
        List<Book> books = bookService.getAll();
        return "house";
    }
}
