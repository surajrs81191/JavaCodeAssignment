package com.animal;

import com.animal.features.Fly;

public abstract class FlyingBird extends Bird implements Fly{
	
	@Override
	public String fly() {
		return "Bird Flying";
		
	}

}
