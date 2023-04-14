package com.slacker.domainTest;

import com.slacker.Book.repository.BookRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@SpringBootTest
public class BookTest
{
    @PersistenceContext
    private EntityManager em;
    @Autowired
    private BookRepository bookRepository;


    @Test
    @Transactional
    public void 가데이터_입력()
    {


    }



}
