package com.ff.factoryPattern;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		if ("cheese".equals(type)) {
			return new CheesePizza();
		} else if ("clam".equals(type)) {
			return new ClamPizza();
		} else if ("veggie".equals(type)) {
			return new VeggiePizza();
		} else if ("pepperoni".equals(type)) {
			return new PepperoniPizza();
		} else return null;
	}

}
