package com.codingdojo.oopadvanced;

public class Bathulhu extends Mammal {
	public int energy = 300;
	
	public int fly() {
		System.out.println("\n");
		System.out.println("You hear the beating of incomprehensibly enormous wings as cosmic evil takes flight...");
		System.out.println("The silence of them, tearing at your ears like a thousand ravenous jackals...");
		System.out.println("You make every effort to scream, but your mouth remains shut.");
		super.setEnergy(energy += 1000);
		super.displayEnergy();
		return energy;
		// Bathulu does not weaken. The eldritch know not weakness.
		// But if they did, it would be: 
		// energy -= 50;
		// return energy;
	}
	
	public int eatHumans() {
		System.out.println("\n");
		System.out.println("As you gaze into an indescribable black abyss, you realize, all too late, that it is the maw of a cosmic horror...");
		System.out.println("You hear the call of Bathulu one last time.");
		System.out.println("Darkness envelopes you.");
		super.setEnergy(energy += 1000);
		super.displayEnergy();
		return energy;
	}
	
	public int attackTown() {
		System.out.println("\n");
		System.out.println("Bathulu descends upon the town...");
		System.out.println("You look around, feeling as though you've both always and never known this place... How could this be?");
		System.out.println("The name of the town escapes you. It remains forever stalwart on the tip of your tongue, never to be found.");
		System.out.println("The town disappears, gradually at first, as motes of light swirl into the vast maw of the eldritch horror...");
		System.out.println("Then, all at once, a giant burst of light blinds you, and fades into blackness.");
		System.out.println("You awake in a thick forest. The impossible darkness of a night with a full moon escapes your comphrension...");
		System.out.println("The maelstrom of your mind rages like a sea in storm... The Call of Bathuhlu consumes every ripple and wave...");
		setEnergy(energy += 1000);
		super.displayEnergy();
		// Eldritch horrors do not weaken, but if they did, it would be: 
		// energy -= 100;
		// return energy;
		return energy;
	}
}
