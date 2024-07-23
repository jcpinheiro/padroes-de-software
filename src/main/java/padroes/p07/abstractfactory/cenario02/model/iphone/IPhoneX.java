package padroes.p07.abstractfactory.cenario02.model.iphone;

import padroes.p07.abstractfactory.cenario02.factory.abstractFactory.CountryRulesAbstractFactory;

public class IPhoneX extends IPhone {

	public IPhoneX(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 5.8in Screen");
		System.out.println("\t- A11 Chipset");
		System.out.println("\t- 3Gb RAM");
		System.out.println("\t- 256Gb Memory");
	}
}
