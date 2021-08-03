package padroes.p05.factorymethod.cenario03refatorado.factory;

import padroes.p05.factorymethod.cenario03refatorado.model.IPhone;

public abstract class IPhoneFactory {

	public IPhone orderIPhone() {
		IPhone device = null;
		
		device = createIPhone();
		
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
	}
	
	protected abstract IPhone createIPhone();
}
