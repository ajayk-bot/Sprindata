package com.example.SPRINGDATA.repositories;

import com.example.SPRINGDATA.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {


}
