package com.ff.DIY;

public abstract class Character {

	FightBehavior fightBehavior;
	
	public void performFight(){
		
		fightBehavior.useWeapon();
		
	}
	
	public void setFightBehavior(FightBehavior fightBehavior){
		
		this.fightBehavior = fightBehavior;
		
	}
	
	
}
