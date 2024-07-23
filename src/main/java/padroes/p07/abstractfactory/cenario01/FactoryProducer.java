package padroes.p07.abstractfactory.cenario01;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factory) {
		
		if(factory.equals("ELECTRIC"))
			return new ElectricCarFactory();

		else if(factory.equals("PETROL"))
			return new PetrolCarFactory();
		
		return null;
	}
}
