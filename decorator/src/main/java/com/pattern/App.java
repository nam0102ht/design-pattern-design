package com.pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	var troll = new TrollSimple();
        var clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
        System.out.println(clubbedTroll.getAttackPower());
    }
}
