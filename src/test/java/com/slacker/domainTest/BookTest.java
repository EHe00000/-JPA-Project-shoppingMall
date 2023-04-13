package com.slacker.domainTest;

import com.slacker.domain.Book;
import com.slacker.member.repository.BookRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

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
