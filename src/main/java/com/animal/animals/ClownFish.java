package com.animal.animals;

import com.animal.Fish;
import com.animal.features.Joke;

public class ClownFish  extends Fish implements Joke{

	public ClownFish() {
		super("Orange","Small");
	}

	@Override
	public String joke() {
		return "Crown Fish is joking";
	}

}
