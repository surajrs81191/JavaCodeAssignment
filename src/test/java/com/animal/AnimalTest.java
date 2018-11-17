package com.animal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.animal.animals.Chicken;
import com.animal.animals.ClownFish;
import com.animal.animals.Dolphin;
import com.animal.animals.Duck;
import com.animal.animals.Parrot;
import com.animal.animals.Rooster;
import com.animal.animals.Shark;
import com.animal.features.Fly;
import com.animal.features.Joke;
import com.animal.features.Sound;
import com.animal.features.Swim;
import com.animal.features.Walk;

public class AnimalTest {

	@Test
	public void animalTest() {
		assert (true);
	}
	//A
	@Test
	public void duckTest() {
		Bird duck = new Duck();
		// 2a
		assertEquals("duck Sound ..", "Quack, quack", duck.sound());
		// 2b
		assertEquals("duck can swim ?", true, duck instanceof Swim);
	}

	@Test
	public void chickenTest() {
		Bird chicken = new Chicken();
		// 2c
		assertEquals("chicken Sound ..", "Cluk Cluk", chicken.sound());
		// 2d
		assertEquals("duck can not Fly ?", false, chicken instanceof Fly);
	}

	@Test
	public void roosterTest() {
		Bird rooster = new Rooster();
		// 3a
		assertEquals("chicken Sound ..", "Cock-a-doodle-doo", rooster.sound());
		// 3b
		// chicken and rooster are related to each other as they both are non
		// flying birds
		// 3c
		//
	}

	@Test
	public void parrotTest() {
		// 4a
		Parrot dogParrot = new Parrot("Woof Woof");
		assertEquals("dogParrot Sound ..", "Woof Woof", dogParrot.sound());

		// 4b
		Parrot catParrot = new Parrot("Meow");
		assertEquals("catParrot Sound ..", "Meow", catParrot.sound());

		// 4c
		Parrot roosterParrot = new Parrot("Cock-a-doodle-doo");
		assertEquals("roosterParrot Sound ..", "Cock-a-doodle-doo", roosterParrot.sound());

		// 4d
		Parrot duckParrot = new Parrot("Quack, quack");
		assertEquals("duckParrot Sound ..", "Quack, quack", duckParrot.sound());
		Parrot phoneParrot = new Parrot("Trin Trin");
		assertEquals("phoneParrot Sound ..", "Trin Trin", phoneParrot.sound());
	}
	
	//B
	@Test
	public void fishTest() {
		Fish fish = new Fish() {
			
		};
		//1a
		assertEquals("fish can not Sound ?", false, fish instanceof Sound);
		
		//1b
		assertEquals("fish can not Walk ?", false, fish instanceof Walk);
		
		//1c
		assertEquals("fish can Swim ?", true, fish instanceof Swim);
		
	}
	@Test
	public void sharkTest() {
		Fish shark = new Shark();
		//2a
		assertEquals("Shark Color ","Grey", shark.getColor());
		assertEquals("Shark size ","Big", shark.getSize());
		//2d
		assertEquals("shark eats", "Fish", ((Shark)shark).eat(new Fish() {
		}));
	}
	@Test
	public void clownFishTest() {
		Fish clownFish = new ClownFish();
		//2b
		assertEquals("clownFish Color ","Orange", clownFish.getColor());
		assertEquals("clownFish size ","Small", clownFish.getSize());
		//2c
		assertEquals("clownFish can joke ?", true, clownFish instanceof Joke);
	}

	@Test
	public void dolphinTest() {
		Animal dolphin = new Dolphin();
		//3a - dolphin is not inherited from fish
		assertEquals("dolphin is not fish ?", false, dolphin instanceof Fish);
		//3b
		assertEquals("dolphin can swim ?", false, dolphin instanceof Swim);
	}

		
}
