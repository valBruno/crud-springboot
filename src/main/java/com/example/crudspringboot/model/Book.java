package com.example.crudspringboot.model;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "BOOKS")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @EqualsAndHashCode.Include
    private String title;

    @Column(length = 500)
    private String description;

    @Column(length = 17)
    @EqualsAndHashCode.Include
    private String isbn;

    //TODO create a new table for authors
    private String author;

    //TODO create a new table for publishers
    private String publisher;

    private String language;
    private Integer publishYear;
    private Integer pages;
}
