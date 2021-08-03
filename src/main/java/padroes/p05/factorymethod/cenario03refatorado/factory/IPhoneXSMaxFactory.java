package padroes.p05.factorymethod.cenario03refatorado.factory;

import padroes.p05.factorymethod.cenario03refatorado.model.IPhone;
import padroes.p05.factorymethod.cenario03refatorado.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneXSMax();
	}

}
