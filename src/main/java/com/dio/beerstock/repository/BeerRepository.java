package com.dio.beerstock.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.beerstock.entity.Beer;

public interface BeerRepository extends JpaRepository<Beer, Long> {

	Optional<Beer> findByName(String name); //Com Optional, conseguimos verificar se uma cerveja é vazia, se existe ou não
	
}
