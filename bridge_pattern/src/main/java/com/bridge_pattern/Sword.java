package com.bridge_pattern;

public class Sword implements Weapon{
	
	private final Enchangement enchangement;
	
	public Sword(Enchangement enchangement) {
		this.enchangement = enchangement;
	}

	public void wield() {
		System.out.println("The sword is wield");
		enchangement.onActived();
	}

	public void swing() {
		System.out.println("The sword is swinged");
		enchangement.apply();
	}

	public void unwield() {
		System.out.println("The sword is unwield");
		
	}

	public Enchangement getEnchangement() {
		return this.enchangement;
	}

}
