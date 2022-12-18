package com.codingdojo.oopadvanced;

public class Mammal {
	public int energy = 100;
	
	public int displayEnergy() {
		System.out.println(energy + " energy remaining.");
		return energy;
	}
}
