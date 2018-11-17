package com.animal.animals;

import com.animal.Fish;
import com.animal.features.Eat;

public class Shark extends Fish implements Eat<Fish> {

	public Shark() {
		super("Grey", "Big");
	}

	@Override
	public String eat(Fish t) {
		return t.toString();
	}

}
