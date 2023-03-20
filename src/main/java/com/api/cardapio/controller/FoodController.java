package com.api.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.cardapio.model.entites.Food;
import com.api.cardapio.model.entites.FoodReponseDTO;
import com.api.cardapio.model.entites.FoodRequestDTO;
import com.api.cardapio.repositorys.FoodRepository;

@RestController
@RequestMapping("food")
public class FoodController {

	@Autowired
	private FoodRepository repository;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping
	public void saveFood(@RequestBody FoodRequestDTO data){
		Food foodData = new Food(data); 
		repository.save(foodData);
		return; 
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping
	public List<FoodReponseDTO> getAll() {
		List<FoodReponseDTO> foodList = repository.findAll().stream().map(FoodReponseDTO::new).toList(); 
		return foodList;
	}

}