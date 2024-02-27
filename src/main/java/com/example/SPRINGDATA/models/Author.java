package com.example.SPRINGDATA.models;

import com.example.SPRINGDATA.models.Book;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long authorId;
    private String authorName;
    private String authorEmail;
    private String authorAddress;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Book> authorBooks;


}
