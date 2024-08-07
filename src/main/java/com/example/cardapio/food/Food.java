package com.example.cardapio.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "foods")
@Entity(name = "foods")
//@Getter                 //Gera os metodos getters dessa classe
//@NoArgsConstructor      //Gera os contrustores dessa classe
//@AllArgsConstructor     //Gera os contrustores dessa classe
//@EqualsAndHashCode(of = "id")   //Indica que o id é representação unica da classe food
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;
    @Getter
    private String title;
    @Getter
    private String image;
    @Getter
    private Integer price;

}
