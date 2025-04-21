package com.example.bookauthor.controller;

import com.example.bookauthor.dto.BookDTO;
import com.example.bookauthor.model.Book;
import com.example.bookauthor.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public Book createBook(@RequestBody BookDTO bookDTO) {
        return bookService.createBook(bookDTO);
    }
}

