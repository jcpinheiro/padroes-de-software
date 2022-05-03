package padroes.p08.decorator.cenario02;

import padroes.p08.decorator.cenario02.model.Drink;
import padroes.p08.decorator.cenario02.model.Expresso;
import padroes.p08.decorator.cenario02.model.Tea;
import padroes.p08.decorator.cenario02.model.decorators.DoubleDrink;
import padroes.p08.decorator.cenario02.model.decorators.Milk;

public class Client {
	
	public static void order(String name, Drink drink) {
		System.out.println("Ordering a " + name);
		drink.serve();
		System.out.println(drink.getPrice());
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		order("Expresso", new Expresso());
		order("Tea", new Tea());
		order("Lungo", new DoubleDrink(new Expresso()));
		order("Lungo", new Milk(new DoubleDrink(new Expresso())) );
		order("Cafe Au Lait", new Milk(new Expresso()));
		order("English Tea", new DoubleDrink(new Milk(new Tea())) );
	}
}
