package com.slacker.Book.controller;

import com.slacker.Book.service.BookSerivce;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/book")
public class BookController
{
    private final BookSerivce bookSerivce;

    public BookController(BookSerivce bookSerivce)
    {
        this.bookSerivce = bookSerivce;
    }

    @GetMapping("insert")
    public String firstBookRegist()
    {
        bookSerivce.firstBookRegist();
        return "redirect:/";
    }
}
