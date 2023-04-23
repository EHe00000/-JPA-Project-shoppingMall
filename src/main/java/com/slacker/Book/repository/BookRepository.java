package com.slacker.Book.repository;

import com.slacker.domain.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Slf4j
public class BookRepository
{
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void save(Book book)
    {
        em.persist(book);
    }

    @Transactional
    public void saveAll(List<Book> book)
    {
        for(Book b : book)
            em.persist(book);
    }

    public List<Book> findAll()
    {
        String jpql = "SELECT b FROM Book b ORDER BY b.id ASC";
        return em.createQuery(jpql,Book.class).getResultList();
    }

    public List<Book> findCategory(String bookStatus)
    {
        log.info("bookStatus : " + bookStatus);
        String jpql = "SELECT b FROM Book b WHERE b.bookStatus = :bookStatus ORDER BY  b.id ASC";
        return em.createQuery(jpql,Book.class)
                .setParameter()
                .getResultList();
    }
}
