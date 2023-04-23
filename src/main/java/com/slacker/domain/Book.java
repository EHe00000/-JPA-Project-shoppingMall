package com.slacker.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "Book")
@Table(name = "BOOK")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Book
{
    @Id @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "book_name")
    private String name;

    @Column(name = "book_price")
    private int price;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "book_status")
    private String bookStatus;

}
