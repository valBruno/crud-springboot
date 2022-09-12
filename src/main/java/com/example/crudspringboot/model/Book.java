package com.example.crudspringboot.model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Book {

    private Long id;
    private String title;
    private String description;
    private String isbn;
    private String author;
    private String publisher;
    private String language;
    private String year;
    private String pages;
}
