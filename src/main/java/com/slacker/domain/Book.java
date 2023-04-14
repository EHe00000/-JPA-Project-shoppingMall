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
    @Id @Column(name = "BOOK_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "BOOK_NAME")
    private String name;

    @Column(name = "BOOK_PRICE")
    private int price;

    @Column(name = "QUANTITY")
    private int quantity;

    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "BOOK_STATUS")
    private String bookStatus;

}
