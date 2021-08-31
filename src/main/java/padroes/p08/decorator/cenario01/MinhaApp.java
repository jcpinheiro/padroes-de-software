package padroes.p08.decorator.cenario01;

public class MinhaApp {

	public static void main(String[] args) {
		Arvore a = new ArvoreNatal();
		
		a = new Estrela(a);
		a = new PiscaPisca(a);
		a = new Bola(a);
		a = new Bola(a);
		a = new Bola(a);
		a = new Bola(a);
		a = new Bola(a);

		a.showEnfeites();
	}

}
