package com.slacker.main.service;

import com.slacker.main.repository.MainReopository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MainService
{
    private final MainReopository mainReopository;

    public MainService(MainReopository mainReopository)
    {
        this.mainReopository = mainReopository;
    }

    public void modify(Long bookCode)
    {
        mainReopository.modify(bookCode);
    }
}
