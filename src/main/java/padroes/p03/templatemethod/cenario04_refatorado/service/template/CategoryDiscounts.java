package padroes.p03.templatemethod.cenario04_refatorado.service.template;

import padroes.p03.templatemethod.cenario04_refatorado.model.Cart;
import padroes.p03.templatemethod.cenario04_refatorado.model.Category;

import java.util.HashMap;
import java.util.Map;


public class CategoryDiscounts extends BestOfferTemplate {
	Map<Category, Double> discountsByCategory;

	public CategoryDiscounts(Cart cart) {
		super(cart);
		loadDiscounts();
	}
	
	public void loadDiscounts() {
		discountsByCategory = new HashMap<Category, Double>();
		discountsByCategory.put(Category.ELETRONICS, 0.3);
		discountsByCategory.put(Category.CLOTHES, 0.05);
	}

	@Override
	public boolean isAppliable() {
		return true;
	}

	@Override
	protected void calibrateVariables() {
		regularItemsPrice = cart.getItems().stream()
				.reduce(0d, (acc, item) -> 
					acc + (item.getValue() * 
							(discountsByCategory.get(item.getCategory()) != null? 
									1 - discountsByCategory.get(item.getCategory()): 1d))
				, Double::sum);
	}

}
