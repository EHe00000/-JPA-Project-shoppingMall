package com.slacker.Book.service;

import com.slacker.Book.dto.BookDTO;
import com.slacker.domain.Book;
import com.slacker.Book.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class BookSerivce
{
    private final BookRepository bookRepository;

    private final ModelMapper modelMapper;

    public BookSerivce(BookRepository bookRepository, ModelMapper modelMapper)
    {
        this.bookRepository = bookRepository;
        this.modelMapper = modelMapper;
    }

    public List<BookDTO> findNewBook()
    {
        List<Book> booklist = bookRepository.findAll();
        return booklist.stream().map(b -> modelMapper.map(b,BookDTO.class)).collect(Collectors.toList());
    }

    public List<BookDTO> findCategoryBook(String bookStatus)
    {
        log.info("BookStatus : " + bookStatus);
        List<Book> bookList = bookRepository.findCategory(bookStatus);
        for(Book b : bookList)
            log.info("book.bookStatus : " + b.getBookStatus());
        return bookList.stream().map(b -> modelMapper.map(b,BookDTO.class)).collect(Collectors.toList());
    }
}
