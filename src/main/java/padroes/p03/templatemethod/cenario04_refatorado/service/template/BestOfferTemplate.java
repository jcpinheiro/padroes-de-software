package padroes.p03.templatemethod.cenario04_refatorado.service.template;


import padroes.p03.templatemethod.cenario04_refatorado.model.Cart;

public abstract class BestOfferTemplate {
	protected Cart cart;
	protected Double regularItemsPrice;
	protected Double deliveryTax;
	protected Double priceFactor;
	protected Double deliveryFactor;
	
	public BestOfferTemplate(Cart cart) {
		this.cart = cart;
		regularItemsPrice = calculateRegularItemsPrice();
		deliveryTax = calculateDeliveryTax();
		priceFactor = 1d;
		deliveryFactor = 1d;
	}
	
	protected Double calculateDeliveryTax() {
		Integer distance = cart.getBuyer().getDistance();
		Double totalWeight = cart.getItems().stream()
				.reduce(0d, (acc, item) -> acc + item.getWeight(), Double::sum);
		return (distance * totalWeight) / 100;
	}
	
	protected Double calculateRegularItemsPrice() {
		return cart.getItems().stream()
				.reduce(0d, (acc, item) -> acc + item.getValue(), Double::sum);
	}

	// template method
	public final Double calculateOffer(Cart cart) {
		calibrateVariables();
	
		return (regularItemsPrice * priceFactor) + (deliveryTax * deliveryFactor);
	}
	
	public abstract boolean isAppliable();
	protected abstract void calibrateVariables();
}
