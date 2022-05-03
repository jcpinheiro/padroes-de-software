package padroes.p03.templatemethod.cenario04_refatorado.service.template;


import padroes.p03.templatemethod.cenario04_refatorado.model.Cart;

public class BlackFriday extends BestOfferTemplate {

	public BlackFriday(Cart cart) {
		super(cart);
	}

	@Override
	public boolean isAppliable() {
		return true;  //FIXME we should use calendar to be dinamic
	}

	@Override
	protected void calibrateVariables() {
		priceFactor = 0.75d;
	}
}
