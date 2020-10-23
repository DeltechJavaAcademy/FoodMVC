package com.example.food.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class FoodType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long foodId;
    private String foodName;
    private String foodGroup;
    private Double foodPrice;

    public FoodType(){
        this(null,null,null,null);
    }
    public FoodType(Long foodId, String foodName, String foodGroup, Double foodPrice){
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodGroup = foodGroup;
        this.foodPrice = foodPrice;
    }

}
