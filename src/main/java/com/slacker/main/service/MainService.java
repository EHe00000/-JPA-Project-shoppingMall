package com.slacker.main.service;

import com.slacker.Book.dto.BookDTO;
import com.slacker.domain.Book;
import com.slacker.main.repository.MainReopository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MainService
{
    private final MainReopository mainReopository;
    private final ModelMapper modelMapper;

    public MainService(MainReopository mainReopository, ModelMapper modelMapper)
    {
        this.mainReopository = mainReopository;
        this.modelMapper = modelMapper;
    }

    public void modify(BookDTO book)
    {
        mainReopository.modify(book);
    }

    public void delete(Long id)
    {
        mainReopository.delete(id);
    }

    public void regist(BookDTO book)
    {
        mainReopository.regist(modelMapper.map(book, Book.class));
    }
}
