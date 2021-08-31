package padroes.p08.decorator.cenario02.model.decorators;

import padroes.p08.decorator.cenario02.model.Drink;

public abstract class DrinkDecorator implements Drink {

	protected Drink drink;


	public DrinkDecorator(Drink drink) {
		this.drink = drink;
	}
}