package com.slacker.main;

import com.slacker.Book.service.BookSerivce;
import com.slacker.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController
{
    private BookSerivce bookSerivce;

    public MainController(BookSerivce bookSerivce)
    {
        this.bookSerivce = bookSerivce;
    }

    @GetMapping("/")
    public String mainPage(Model model)
    {
        List<Book> bookList = bookSerivce.findNewBook();
        model.addAttribute("bookList", bookList);

        return "index";
    }

}
