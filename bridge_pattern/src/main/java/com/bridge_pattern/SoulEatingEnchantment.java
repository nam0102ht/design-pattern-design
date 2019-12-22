package com.bridge_pattern;

public class SoulEatingEnchantment implements Enchangement{

	public void onActived() {
		System.out.println("The item spreads bloodlust.");
	}

	public void apply() {
		System.out.println("The item eats the soul of enemies.");
	}

	public void onDeactived() {
		System.out.println("Bloodlust slowly disappears.");
	}
}
