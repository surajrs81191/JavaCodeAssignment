package com.animal.features;

import com.animal.Animal;

public interface Metamorphosis<T extends Animal> {
	T metamorphosis();
}
