package com.api.cardapio.model.entites;

public record FoodReponseDTO(Long id, String title, String image, Integer price){

	public FoodReponseDTO(Food food) {
		this(food.getId(), food.getTitle(), food.getImage(), food.getPrice()); 
	}
}
