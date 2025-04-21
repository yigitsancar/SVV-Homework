package com.example.bookauthor.service;

import com.example.bookauthor.dto.AuthorDTO;
import com.example.bookauthor.model.Author;
import com.example.bookauthor.repository.AuthorRepository; // ✅ Eksik import eklendi
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author createAuthor(AuthorDTO authorDTO) {
        Author author = new Author();
        author.setName(authorDTO.getName());
        author.setBirthYear(authorDTO.getBirthYear());
        return authorRepository.save(author);
    }
}
