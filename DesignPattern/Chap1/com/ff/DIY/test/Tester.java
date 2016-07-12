package com.ff.DIY.test;

import com.ff.DIY.King;
import com.ff.DIY.Character;
import com.ff.DIY.FightWithBowAndArrow;

public class Tester {

	public static void main(String[] args) {
		
		Character king = new King();	
		
		king.performFight();
		
		king.setFightBehavior(new FightWithBowAndArrow());
		
		king.performFight();
	}
	
}
