package padroes.p05.factorymethod.cenario03;


import padroes.p05.factorymethod.cenario03.model.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Client {
	
	public IPhone orderIPhone(String generation, String level) {
		IPhone device = null;
		
		if(generation.equals("X")) {
			if(level.equals("standard")) {
				device = new IPhoneX();
			} else if(level.equals("highEnd")) {
				device = new IPhoneXSMax();
			}
		} else if(generation.equals("11")) {
			if(level.equals("standard")) {
				device = new IPhone11();
			} else if(level.equals("highEnd")) {
				device = new IPhone11Pro();
			}

		}
		
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
	}

	public static void main(String[] args) {
		Client client = new Client();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = client.orderIPhone("X", "standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = client.orderIPhone("11", "highEnd");
		System.out.println(iphone2);
	}
}
