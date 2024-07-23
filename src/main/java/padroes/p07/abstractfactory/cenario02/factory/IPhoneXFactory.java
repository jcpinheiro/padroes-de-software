package padroes.p07.abstractfactory.cenario02.factory;

import padroes.p07.abstractfactory.cenario02.factory.abstractFactory.CountryRulesAbstractFactory;
import padroes.p07.abstractfactory.cenario02.model.iphone.IPhone;
import padroes.p07.abstractfactory.cenario02.model.iphone.IPhoneX;
import padroes.p07.abstractfactory.cenario02.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX(rules);
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax(rules);
		} else return null;
	}

}
