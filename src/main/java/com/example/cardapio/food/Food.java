package com.example.cardapio.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "foods")
@Entity(name = "foods")
@Getter                 //Gera os metodos getters dessa classe
@NoArgsConstructor      //Gera os contrutores dessa classe
@AllArgsConstructor     //Gera os contrutores dessa classe
@EqualsAndHashCode(of = "id")   //Indica que o id é representação unica da classe food
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;

    public Food(FoodRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }
}
