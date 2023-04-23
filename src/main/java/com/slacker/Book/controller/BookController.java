package com.slacker.Book.controller;

import com.slacker.Book.dto.BookDTO;
import com.slacker.Book.service.BookSerivce;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/main/book")
public class BookController
{
    private final BookSerivce bookSerivce;

    public BookController(BookSerivce bookSerivce)
    {
        this.bookSerivce = bookSerivce;
    }

    @GetMapping("/bookPage")
    public String bookPage(@RequestParam String category , Model model)
    {
        List<BookDTO> bookList = bookSerivce.findCategoryBook(category);
        model.addAttribute("bookList", bookList);
        return "/book/bookPage";
    }
}
