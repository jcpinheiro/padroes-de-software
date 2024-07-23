package padroes.p07.abstractfactory.cenario02.model.iphone;

import padroes.p07.abstractfactory.cenario02.factory.abstractFactory.CountryRulesAbstractFactory;

public abstract class IPhone {
	CountryRulesAbstractFactory rules;
	
	public IPhone(CountryRulesAbstractFactory rules) {
		this.rules = rules;
	}

	public abstract void getHardware();
	
	public void assemble() {
		System.out.println("Assembling all the hardwares");
	}

	public void certificates() {
		System.out.println("Testing all the certificates");
	}

	public void pack() {
		System.out.println("Packing the device");
	}
}
