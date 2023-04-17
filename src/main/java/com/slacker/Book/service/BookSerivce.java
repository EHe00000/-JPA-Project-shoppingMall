package com.slacker.Book.service;

import com.slacker.domain.Book;
import com.slacker.Book.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class BookSerivce
{
    private final BookRepository bookRepository;

    public BookSerivce(BookRepository bookRepository)
    {
        this.bookRepository = bookRepository;
    }

    public List<Book> findNewBook()
    {
        return bookRepository.findAll();
    }
}
