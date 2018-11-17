package com.animal;

import com.animal.features.Sound;
import com.animal.features.Walk;

public abstract class Bird implements Animal,Walk,Sound {
	
	public String walk() {
		return "Bird is walking";
	}

}
