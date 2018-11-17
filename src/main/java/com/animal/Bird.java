package com.animal;

import com.animal.features.Sing;
import com.animal.features.Walk;

public abstract class Bird implements Animal,Walk,Sing {
	
	public void walk() {
		System.out.println("Bird is walking");
	}

}
