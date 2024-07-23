package padroes.p05.factorymethod.cenario01;


public class App {

	public static void main(String[] args) {
		
		Animal animal = AnimalFactory.getAnimal(AnimalType.LION);
		animal.eat();

	}
}
