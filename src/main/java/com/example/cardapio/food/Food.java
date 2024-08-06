package com.example.cardapio.food;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "foods")
@Entity(name = "foods")
public class Food {
    private Long id;
    private String title;
    private String image;
    private Integer price;
}
