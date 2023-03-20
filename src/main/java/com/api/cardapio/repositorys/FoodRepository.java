package com.api.cardapio.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.cardapio.model.entites.Food;

public interface FoodRepository extends JpaRepository<Food, Long>{

}
