package com.example.bookauthor.controller;

import com.example.bookauthor.dto.AuthorDTO;
import com.example.bookauthor.model.Author;
import com.example.bookauthor.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @PostMapping
    public Author createAuthor(@RequestBody AuthorDTO authorDTO) {
        return authorService.createAuthor(authorDTO);
    }
}
