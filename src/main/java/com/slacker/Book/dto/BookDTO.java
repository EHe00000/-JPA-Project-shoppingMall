package com.slacker.Book.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class BookDTO
{
    private Long id;
    private String name;
    private int price;
    private int quantity;
    private String isbn;
    private String bookStatus;
}
