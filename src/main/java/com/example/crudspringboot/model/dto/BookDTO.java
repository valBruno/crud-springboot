package com.example.crudspringboot.model.dto;


import com.example.crudspringboot.model.Book;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookDTO {

    private Long id;
    private String title;
    private String description;
    private String isbn;
    private String author;
    private String publisher;
    private String language;
    private Integer year;
    private Integer pages;

    public BookDTO(Book book) {
        this.id = book.getId();
        this.title = book.getTitle();
        this.description = book.getDescription();
        this.isbn = book.getIsbn();
        this.author = book.getAuthor();
        this.publisher = book.getPublisher();
        this.language = book.getLanguage();
        this.year = book.getPublishYear();
        this.pages = book.getPages();
    }
}
