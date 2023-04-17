package com.slacker.main.repository;

import com.slacker.Book.dto.BookDTO;
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
    public void modify(BookDTO book)
    {
       Book modifyBook = em.find(Book.class,book.getId());
       if(!book.getName().isEmpty())
           modifyBook.setName(book.getName());
       if(book.getPrice() != modifyBook.getPrice() && book.getPrice() != 0)
           modifyBook.setPrice(book.getPrice());
       if(book.getBookStatus() != modifyBook.getBookStatus())
           modifyBook.setBookStatus(book.getBookStatus());

    }
    @Transactional
    public void delete(Long id)
    {
        em.remove(em.find(Book.class,id));
    }

    @Transactional
    public void regist(Book book)
    {
        em.persist(book);
    }
}
