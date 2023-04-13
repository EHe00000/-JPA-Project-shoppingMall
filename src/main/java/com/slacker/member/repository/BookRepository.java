package com.slacker.member.repository;

import com.slacker.domain.Book;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
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
}
