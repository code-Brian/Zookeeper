package com.codingdojo.oopadvanced;

public class Gorilla extends Mammal {
	// proof of throw concept: https://insidethemagic.net/2021/07/gorilla-throws-poop-animal-kingdom-kj1/
	public int displayEnergy() {
		System.out.println(energy + "/100 energy remaining...");
		return energy;
	}
	
	public int stinkyToss() {
		if(energy < 5) {
			System.out.println("The gorilla is too tired for that... Try eating a banana!");
		} else {
			System.out.println("The gorilla threw something stinky! Watch out!");
			energy -= 5;
			displayEnergy();
		}
		return energy;
	}
	
	public int eatNana() {
		if (energy <= 90) {
			System.out.println("The gorilla is eating a banana! Energy restored!");
			energy += 10;
			displayEnergy();
			return energy;
		}  else {
			System.out.println("The gorilla is too full right now... Try burning some energy!");
		}
		return energy;
	}
	
	public int climb() {
		if (energy >= 10) {
			System.out.println("The gorilla is climbing! Neat!");
			energy -= 10;
			displayEnergy();
			return energy;
		} else {
			System.out.println("The gorilla is too tired for that... Try eating a banana!");
		}
		return energy;
	}
}
