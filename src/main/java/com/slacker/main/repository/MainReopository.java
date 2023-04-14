package com.slacker.main.repository;

import com.slacker.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class MainReopository
{
    @Autowired
    private EntityManager em;

    @Transactional
    public void modify(Long bookCode)
    {
       Book book = em.find(Book.class,bookCode);
       book.setBookStatus("BEST");
    }
}
