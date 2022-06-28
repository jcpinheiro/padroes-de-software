package padroes.p15.facade.cenario02_refatorado.services;

import java.util.List;

import padroes.p15.facade.cenario02_refatorado.model.Card;
import padroes.p15.facade.cenario02_refatorado.model.Register;
import padroes.p15.facade.cenario02_refatorado.services.CardService;
import padroes.p15.facade.cenario02_refatorado.services.PaymentService;
import padroes.p15.facade.cenario02_refatorado.services.RegisterService;
import padroes.p15.facade.cenario02_refatorado.services.ReportService;
import padroes.p15.facade.cenario02_refatorado.services.SecurityService;

public class CallCenterFacade {
	CardService cardService;
	RegisterService registerService;
	ReportService reportService;
	PaymentService paymentService;
	SecurityService securityService;
	
	public CallCenterFacade() {
		cardService = new CardService();
		registerService = new RegisterService();
		reportService = new ReportService(registerService);
		paymentService = new PaymentService(registerService);
		securityService = new SecurityService(cardService, registerService);
	}
	
	public Card getCardByUser(Long l) {
		return cardService.getCardByUser(l);
	}
	
	public void getSumary(Card card) {
		reportService.getSumary(card);
	}
	
	public void getPaymentInfoByCard(Card card) {
		paymentService.getPaymentInfoByCard(card);
	}
	
	public void cancelLastRegister(Card card) {
		List<Register> registers = registerService.getRegistersByCard(card);
		registerService.removeByIndex(card, registers.size() - 1);
		List<Register> pendingRegisters = securityService.blockCard(card);
		Card newCard = cardService.createNewCard(123456L, 33445566L);
		registerService.addCardRegisters(newCard, pendingRegisters);
		reportService.getSumary(newCard);
	}
}
