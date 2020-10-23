package com.example.food.service;

import com.example.food.domain.FoodType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.food.repository.FoodRepo;

@Service
public class FoodService{

    private FoodRepo foodRepo;


    @Autowired //Implements FoodRepo
    public FoodService(FoodRepo foodRepo){
        this.foodRepo = foodRepo;
    }

    public FoodType create(FoodType food){
        return foodRepo.save(food);
    }

    public FoodType read(Long foodId){
        return foodRepo.findById(foodId).get();
    }

    public Iterable<FoodType> readAll(){
        return foodRepo.findAll();
    }

    public FoodType update(FoodType foodType, Long foodId){
        FoodType dataToUpdate = read(foodId);
        dataToUpdate.setFoodId(foodType.getFoodId());
        dataToUpdate.setFoodName(foodType.getFoodName());
        dataToUpdate.setFoodGroup(foodType.getFoodGroup());
        dataToUpdate.setFoodPrice(foodType.getFoodPrice());
        return foodRepo.save(dataToUpdate);
    }

    public FoodType delete(Long foodId){
        FoodType dataToDelete = read(foodId);
        foodRepo.delete(dataToDelete);
        return dataToDelete;
    }

}
