package com.example.food.repository;

import com.example.food.domain.FoodType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepo extends CrudRepository<FoodType, Long> {
}
