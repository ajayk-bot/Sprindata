package com.example.SPRINGDATA.models;
import com.example.SPRINGDATA.enumsConstant.BookCategory;
import com.example.SPRINGDATA.enumsConstant.Language;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    private String bookTitle;
    private String bookName;
    private String bookAuthorName;
    private String bookDescription;
    private String bookPublisherName;
    @Enumerated(value = EnumType.STRING)
    private Language language;
    private Long bookPrice;
    @Enumerated(value = EnumType.STRING)
    private BookCategory bookCategory;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date bookPublishedDate;
    @ManyToOne
    @JoinColumn(name = "authorId")
    private Author author;


}
