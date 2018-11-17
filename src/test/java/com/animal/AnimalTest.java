package com.animal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.animal.animals.Duck;
import com.animal.features.Swim;


public class AnimalTest {

	@Test
	public void animalTest() {
		assert(true);
	}
	
	@Test
	public void duckTest() {
		Bird duck = new Duck();
		//2a
		assertEquals("duck Sound ..",duck.sound(), "Quack, quack");
		//2b
		assertEquals("duck can swim ?",duck instanceof Swim, true);
	}
	
}
