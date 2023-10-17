package com.adrain.adrainspringboottest.repository;

import com.adrain.adrainspringboottest.entity.Author;
import com.adrain.adrainspringboottest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
