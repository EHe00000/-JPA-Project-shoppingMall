package com.slacker.configTest;

import com.slacker.JPAmall.JpaMallApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SpringBootTest(classes = JpaMallApplication.class)
@Slf4j
public class MysqlTest {
    @PersistenceContext
    private EntityManager em;

    @Test
    @Transactional
    public void mysql_접속_테스트(){
        em.createNativeQuery("select 1").getSingleResult();
        log.info("JPA Connection Success!");
    }
}
