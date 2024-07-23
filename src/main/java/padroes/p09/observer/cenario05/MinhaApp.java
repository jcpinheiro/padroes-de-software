package padroes.p09.observer.cenario05;

public class MinhaApp {

	public static void main(String[] args) {
		//Observador
		CarroPolicia carroPolicia = new CarroPolicia();
		
		//Observado
		CarroRoubado carroRoubado = new CarroRoubado();
		
		//Adicionar observador ao observado
		carroRoubado.addObserver(carroPolicia);
		
		carroRoubado.frente();
		carroRoubado.direita();
		carroRoubado.frente();
		carroRoubado.esquerda();
		carroRoubado.para();

	}

}
