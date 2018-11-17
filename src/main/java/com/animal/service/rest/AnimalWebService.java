package com.animal.service.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.animal.Animal;
import com.animal.animals.Duck;

@RestController
public class AnimalWebService {

	@GetMapping(value="/animals/{animalName}",produces = "application/json")
	public Animal getAnimal(@PathVariable("animalName") String animalName ) {
		switch (animalName) {
		case "duck":
			return new Duck();
		default:
			break;
		}
		return new Animal() {
		};
	}
}
