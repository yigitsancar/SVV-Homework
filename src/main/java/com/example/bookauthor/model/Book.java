package com.example.bookauthor.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private int publicationYear;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;
}
