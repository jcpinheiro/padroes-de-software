package padroes.p05.factorymethod.cenario03refatorado.factory;

import padroes.p05.factorymethod.cenario03refatorado.model.IPhone;
import padroes.p05.factorymethod.cenario03refatorado.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	protected IPhone createIPhone() {
		return new IPhone11();


	}

}
