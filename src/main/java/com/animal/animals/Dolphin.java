package com.animal.animals;

import com.animal.Animal;
import com.animal.features.Swim;

public class Dolphin implements Animal , Swim{

	@Override
	public String swim() {
		return "Dlophin Swmiming";
	}

}
