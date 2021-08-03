package padroes.p05.factorymethod.cenario03refatorado.factory;

import padroes.p05.factorymethod.cenario03refatorado.model.IPhone;
import padroes.p05.factorymethod.cenario03refatorado.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}
