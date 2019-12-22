package com.bridge_pattern;

public class FlyingEnchantment implements Enchangement{

	public void onActived() {
		System.out.println("The item begins to glow faintly.");
		
	}

	public void apply() {
		System.out.println("The item flies and strikes the enemies finally returning to owner's hand.");
		
	}

	public void onDeactived() {
		System.out.println("The item's glow fades.");
		
	}

}
