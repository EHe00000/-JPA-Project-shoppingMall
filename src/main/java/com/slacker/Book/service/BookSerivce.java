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

    public void firstBookRegist()
    {
        String[] name = {"불편한편의점","스즈메의 문단속","메리골드 마음 세탁소"};
        int[] price = {14000, 13000, 13500};
        String[] isbm = {"9791161571188","9791169791977","9791191891287"};

        List<Book> books = new ArrayList<>();
        Book book1 = new Book(null,name[0],price[0],10,isbm[0],"NEW");
        Book book2 = new Book(null,name[1],price[1],10,isbm[1],"NEW");
        Book book3 = new Book(null,name[2],price[2],10,isbm[2],"NEW");
        books.add(book1);
        books.add(book2);
        books.add(book3);

        for(Book b : books)
            bookRepository.save(b);
    }

    public List<Book> findNewBook()
    {
        return bookRepository.findAll();
    }
}
