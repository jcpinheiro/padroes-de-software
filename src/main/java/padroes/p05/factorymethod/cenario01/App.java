package padroes.p05.factorymethod.cenario01;

import java.text.NumberFormat;
import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		
		Animal animal = AnimalFactory.getAnimal(AnimalType.LION);
		animal.eat();

	}
}
