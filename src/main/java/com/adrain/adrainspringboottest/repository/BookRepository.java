package com.adrain.adrainspringboottest.repository;

import com.adrain.adrainspringboottest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
