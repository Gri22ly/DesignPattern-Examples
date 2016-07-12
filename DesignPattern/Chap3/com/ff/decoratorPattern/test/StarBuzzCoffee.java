package com.ff.decoratorPattern.test;

import com.ff.decoratorPattern.Beverage;
import com.ff.decoratorPattern.DarkRoast;
import com.ff.decoratorPattern.Espresso;
import com.ff.decoratorPattern.HouseBlend;
import com.ff.decoratorPattern.Mocha;
import com.ff.decoratorPattern.Soy;
import com.ff.decoratorPattern.Whip;

public class StarBuzzCoffee {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}
}
