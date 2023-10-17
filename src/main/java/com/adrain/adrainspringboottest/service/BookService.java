package com.adrain.adrainspringboottest.service;

import com.adrain.adrainspringboottest.entity.Author;
import com.adrain.adrainspringboottest.entity.Book;
import com.adrain.adrainspringboottest.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book createBook(String title, Author author) {
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        return bookRepository.save(book);
    }
}

