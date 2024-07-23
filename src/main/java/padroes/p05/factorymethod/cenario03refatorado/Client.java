package padroes.p05.factorymethod.cenario03refatorado;

import padroes.p05.factorymethod.cenario03refatorado.factory.IPhone11ProFactory;
import padroes.p05.factorymethod.cenario03refatorado.factory.IPhoneFactory;
import padroes.p05.factorymethod.cenario03refatorado.factory.IPhoneXFactory;
import padroes.p05.factorymethod.cenario03refatorado.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iphone11ProFactory.orderIPhone();
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iphone11ProFactory.orderIPhone();
		System.out.println(iphone2);
	}
}
