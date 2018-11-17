package com.animal.animals;

import com.animal.FlyingBird;

public class Parrot extends FlyingBird {
	private String say = "Parrot sing";

	public Parrot(String say) {
		this.say = say;
	}

	@Override
	public String sound() {
		return say;
	}

	
}
