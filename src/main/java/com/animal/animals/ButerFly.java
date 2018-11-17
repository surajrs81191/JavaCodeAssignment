package com.animal.animals;

import com.animal.Animal;
import com.animal.features.Fly;

public class ButerFly implements Animal,Fly {

	@Override
	public String fly() {
		return "ButerFly is flying";
	}
}
