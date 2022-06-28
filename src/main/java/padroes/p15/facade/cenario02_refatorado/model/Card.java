package padroes.p15.facade.cenario02_refatorado.model;

import java.util.List;

public class Card {
	private Long userNumber;
	private Long cardNumber;
	private List<Register> registerList;
	
	public Card(Long userNumber, Long cardNumber) {
		this.userNumber = userNumber;
		this.cardNumber = cardNumber;
	}

	public Long getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(Long userNumber) {
		this.userNumber = userNumber;
	}

	public Long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public String toString() {
		return "Card [userNumber=" + userNumber + ", cardNumber=" + cardNumber + "]";
	}
}
