package com.animal.animals;

import com.animal.Animal;
import com.animal.features.Metamorphosis;
import com.animal.features.Walk;

public class CaterPillar implements Animal,Walk,Metamorphosis<ButerFly>{

	@Override
	public String walk() {
		return "Caterpillar walking";
	}

	@Override
	public ButerFly metamorphosis() {
		return new ButerFly();
	}

}
