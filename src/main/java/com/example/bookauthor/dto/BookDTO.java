package com.example.bookauthor.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
    private String title;
    private int publicationYear;
    private Long authorId;
}

