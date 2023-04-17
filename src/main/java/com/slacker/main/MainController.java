package com.slacker.main;

import com.slacker.Book.dto.BookDTO;
import com.slacker.Book.service.BookSerivce;
import com.slacker.domain.Book;
import com.slacker.main.service.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController
{
    private BookSerivce bookSerivce;
    private MainService mainService;

    public MainController(BookSerivce bookSerivce , MainService mainService)
    {
        this.bookSerivce = bookSerivce;
        this.mainService = mainService;
    }

    @GetMapping("/")
    public String mainPage(Model model)
    {
        List<Book> bookList = bookSerivce.findNewBook();
        model.addAttribute("bookList", bookList);

        return "index";
    }

    @GetMapping("/main/book/regist")
    public String registBook() { return "main/book/regist"; }

    @PostMapping("/main/regist")
    public String regist(@ModelAttribute BookDTO book)
    {
        mainService.regist(book);
        return "redirect:/";
    }

    @GetMapping("/main/book/modify")
    public String modifyPage(){ return "main/book/modify"; }

    @PostMapping("main/modify")
    public String modify(@ModelAttribute BookDTO book)
    {
        mainService.modify(book);
        return "redirect:/";
    }

    @GetMapping("/main/book/delete")
    public String deletePage() { return "main/book/delete"; }

    @PostMapping("/main/delete")
    public String delete(@RequestParam Long id)
    {
        mainService.delete(id);
        return "redirect:/";
    }

}
