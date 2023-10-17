package com.adrain.adrainspringboottest.service;

import static org.junit.jupiter.api.Assertions.*;

import com.adrain.adrainspringboottest.entity.Author;
import com.adrain.adrainspringboottest.entity.Book;
import com.adrain.adrainspringboottest.repository.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Autowired
    private AuthorRepository authorRepository;

    @Test
    public void testCreateBook() {
        Author author = new Author();
        author.setName("张三");
        authorRepository.save(author);

        Book book = bookService.createBook("Java 编程入门", author);
        assertNotNull(book);
        assertEquals("Java 编程入门", book.getTitle());
        assertEquals(author, book.getAuthor());
    }
}
