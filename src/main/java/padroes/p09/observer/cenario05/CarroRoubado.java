package padroes.p09.observer.cenario05;

import java.util.Observable;


public class CarroRoubado extends Observable implements Carro {
	
	private String acao = "";
	
	public void frente() {
		acao = "frente";
		System.out.println("Carro roubado segue em frente.");
		this.mudaEstado();
	}

	public void direita() {
		acao = "direita";
		System.out.println("Carro roubado vira a direita.");
		this.mudaEstado();
	}

	public void esquerda() {
		acao = "esquerda";
		System.out.println("Carro roubado vira a esquerda.");
		this.mudaEstado();
	}
	
	public void para() {
		acao = "pára";
		System.out.println("Carro roubado pára.");
		this.mudaEstado();
	}
	
	public void mudaEstado(){
		setChanged(); // Mudou o estado
		notifyObservers(acao); // Notifica os observadores
	}
}
