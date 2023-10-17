package com.adrain.adrainspringboottest.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    @ManyToOne
    private Author author;
}
