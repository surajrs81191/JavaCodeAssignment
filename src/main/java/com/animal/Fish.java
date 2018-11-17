package com.animal;

import com.animal.features.Swim;

public abstract class Fish implements Animal,Swim{
	
	protected String color;
	protected String size;
	
	public Fish(){
		this.color="";
		this.size="";
	}
	
	public Fish(String color, String size) {
		this.color =color;
		this.size= size;
	}
	@Override
	public String swim() {
		return "Fish Swims";
		
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fish";
	}
	
	
}
