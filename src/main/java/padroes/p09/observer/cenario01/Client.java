package padroes.p09.observer.cenario01;

import padroes.p09.observer.cenario01.observers.Friend;
import padroes.p09.observer.cenario01.observers.Wife;
import padroes.p09.observer.cenario01.subject.Doorman;

public class Client {

	public static void main(String[] args) {
		Doorman doorman = new Doorman();
		doorman.add(new Wife() );
		doorman.add(new Friend() );
		
		System.out.println("Husband is comming" );
		doorman.setStatus(true);
	}
}
