package com.example.food.controller;

import com.example.food.domain.FoodType;
import com.example.food.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/food")
public class FoodController {

    private FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService){
        this.foodService = foodService;
    }

    @PostMapping(value = "/create") //Cretes sub-url
    public ResponseEntity<FoodType> create(@RequestBody FoodType foodType){ //Getting front end info
        return new ResponseEntity<FoodType>(foodService.create(foodType), HttpStatus.CREATED);
    }

//    @PostMapping(value = "/createall") //Cretes sub-url
//    public ResponseEntity<Iterable><FoodType> createAll(@RequestBody FoodType foodType){ //Getting front end info
//        return new ResponseEntity<FoodType>(foodService.create(foodType), HttpStatus.CREATED);
//    }

    @GetMapping(value = "/read/{foodId}")
    public ResponseEntity<FoodType> getFood(@PathVariable Long foodId){ //@PathVariable gets FoodType attribute specified
        return new ResponseEntity<FoodType>(foodService.read(foodId), HttpStatus.OK);
    }

    @GetMapping(value = "/readall")
    public ResponseEntity<Iterable<FoodType>> getAll(){
        return new ResponseEntity<>(foodService.readAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/update")
    public
}
