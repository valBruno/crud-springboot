package com.example.crudspringboot.service;

import com.example.crudspringboot.model.Book;
import com.example.crudspringboot.model.dto.BookDTO;
import com.example.crudspringboot.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<BookDTO> listBooks() {
        List<Book> list = repository.findAll();


        return list.stream().map(BookDTO::new).collect(Collectors.toList());

    }
}
