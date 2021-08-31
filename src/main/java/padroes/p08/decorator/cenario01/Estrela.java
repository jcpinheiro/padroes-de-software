package padroes.p08.decorator.cenario01;

//ConcreteDecorator
public class Estrela extends Decoracao {
		
	public Estrela(Arvore a) {
		super(a);
	}

	public void showEnfeites() {
		super.showEnfeites();
		System.out.print("Estrela, ");
	}
}
