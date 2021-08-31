package padroes.p08.decorator.cenario01;

//ConcreteDecorator
public class Bola extends Decoracao {
	
	public Bola(Arvore a) {
		super(a);
	}

	public void showEnfeites() {
		super.showEnfeites();
		System.out.print("Bola, ");
	}
	
}
