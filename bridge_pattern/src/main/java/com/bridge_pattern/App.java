package com.bridge_pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var enchantedSword = new Sword(new SoulEatingEnchantment());
        enchantedSword.swing();
        enchantedSword.wield();
        enchantedSword.unwield();
        
        var hammerSword = new Hammer(new FlyingEnchantment());
        hammerSword.swing();
        hammerSword.wield();
        hammerSword.unwield();
        
    }
}
