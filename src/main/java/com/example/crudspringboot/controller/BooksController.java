package com.example.crudspringboot.controller;


import com.example.crudspringboot.model.dto.BookDTO;
import com.example.crudspringboot.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private BookService service;

    public BooksController(BookService service) {
        this.service = service;
    }

    @RequestMapping
    public List<BookDTO> listBooks() {
        return this.service.listBooks();
    }
}
