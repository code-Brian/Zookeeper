package com.codingdojo.oopadvanced;

public class Mammal {
	public int energy = 100;
	
	public void displayEnergy() {
		System.out.println(energy + " energy remaining.");
	}
	
	public void setEnergy(int energy) {
		this.energy  = energy;
	}
	
	public int getEnergy() {
		return energy;
	}
}
