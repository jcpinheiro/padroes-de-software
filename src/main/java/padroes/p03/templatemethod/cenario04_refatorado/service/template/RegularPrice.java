package padroes.p03.templatemethod.cenario04_refatorado.service.template;

import padroes.p03.templatemethod.cenario04_refatorado.model.Cart;

public class RegularPrice extends BestOfferTemplate {

	public RegularPrice(Cart cart) {
		super(cart);
	}

	@Override
	public boolean isAppliable() {
		return true;
	}

	@Override
	protected void calibrateVariables() {
		// Nothing to adjust!
	}

}
