package com.example.bookauthor.service;

import com.example.bookauthor.dto.BookDTO;
import com.example.bookauthor.model.Author;
import com.example.bookauthor.model.Book;
import com.example.bookauthor.repository.AuthorRepository; // ✅ Eksik import eklendi
import com.example.bookauthor.repository.BookRepository; // ✅ Eksik import eklendi
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository; // ✅ Eksik değişken tanımlandı

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book createBook(BookDTO bookDTO) {
        Author author = authorRepository.findById(bookDTO.getAuthorId()).orElse(null);
        if (author == null) {
            throw new RuntimeException("Author not found");
        }

        Book book = new Book();
        book.setTitle(bookDTO.getTitle());
        book.setPublicationYear(bookDTO.getPublicationYear());
        book.setAuthor(author);

        return bookRepository.save(book);
    }
}
