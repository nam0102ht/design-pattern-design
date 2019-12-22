package com.bridge_pattern;

public class Hammer implements Weapon{
	
	private final Enchangement enchangement;
	
	public Hammer(Enchangement enchangement){
		this.enchangement = enchangement;
	}

	public void wield() {
		System.out.println("The hammer is wield");
		enchangement.onActived();
	}

	public void swing() {
		System.out.println("The hammer is swinged");
		enchangement.apply();
	}

	public void unwield() {
		System.out.println("The hammer is unwield");
		enchangement.onDeactived();
	}

	public Enchangement getEnchangement() {
		return enchangement;
	}

}
