package com.animal.animals;

import com.animal.FlyingBird;
import com.animal.features.Swim;

public class Duck extends FlyingBird implements Swim{

	@Override
	public String sound() {
		return "Quack, quack";
	}

	@Override
	public String swim() {
		return "Duck is swiming";
		
	}

	@Override
	public String walk() {
		return "Duck is Walking";
	}
}
