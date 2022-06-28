package padroes.p15.facade.cenario02_refatorado;

import padroes.p15.facade.cenario02_refatorado.services.CallCenterFacade;
import padroes.p15.facade.cenario02_refatorado.model.Card;

public class Client {

	public static void main(String[] args) {
		CallCenterFacade facade = new CallCenterFacade();
		
		Card card = facade.getCardByUser(123456L);
		System.out.println(card);
		
		facade.getSumary(card);
		
		facade.getPaymentInfoByCard(card);
		
		facade.cancelLastRegister(card);
		
		Card newCard = facade.getCardByUser(123456L);
		System.out.println(newCard);
	}
}
