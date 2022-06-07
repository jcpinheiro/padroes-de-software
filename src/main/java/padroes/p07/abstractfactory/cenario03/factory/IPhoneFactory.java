package padroes.p07.abstractfactory.cenario03.factory;

import padroes.p07.abstractfactory.cenario03.factory.abstractFactory.CountryRulesAbstractFactory;
import padroes.p07.abstractfactory.cenario03.model.iphone.IPhone;

public abstract class IPhoneFactory {
	CountryRulesAbstractFactory rules;
	
	public IPhoneFactory(CountryRulesAbstractFactory rules) {
		this.rules = rules;
	}

	public IPhone orderIPhone(String level) {
		IPhone device = null;
		
		device = createIPhone(level);
		
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
	}
	
	protected abstract IPhone createIPhone(String level);
}
