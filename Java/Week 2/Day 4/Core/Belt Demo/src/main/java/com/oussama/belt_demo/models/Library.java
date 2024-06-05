package com.oussama.belt_demo.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name="libraries")
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotEmpty
    @Size(min = 3, max = 200, message = "Name must be between 3 and 200 characters")
    private String name;

    @NotEmpty
    @Size(min = 2, max = 200, message = "Location must be between 2 and 200 characters")
    private String location;

    // ONE TO MANY :
    @OneToMany(mappedBy ="library", fetch = FetchType.EAGER)
    private List<Book> books;
















    // CONSTRUCTOR
    public Library() {
    }

    public Library(String name, String location) {
        this.name = name;
        this.location = location;
    }
    // -------------------------------- GETTERS AND SETTERS --------------------------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
