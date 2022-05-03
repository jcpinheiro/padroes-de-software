package padroes.p03.templatemethod.cenario04.model;

import java.util.Collections;
import java.util.List;

public class Cart {
	private Buyer buyer;
	private List<Product> items;
	
	public Cart(Buyer buyer, List<Product> items) {
		this.buyer = buyer;
		this.items = items;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	public List<Product> getItems() {
		return Collections.unmodifiableList(items );
	}

	/*public void setItems(List<Product> items) {
		this.items = items;
	}*/

	public void adiciona(Product product ) {
		items.add(product );
	}
}
