package padroes.p08.decorator.cenario01;

//Decorator
public abstract class Decoracao extends Arvore {
	
	private final Arvore arvore;
	
	public Decoracao(Arvore arvore){
		this.arvore = arvore;
	}
	
	public void showEnfeites() {
		arvore.showEnfeites();
	}
}