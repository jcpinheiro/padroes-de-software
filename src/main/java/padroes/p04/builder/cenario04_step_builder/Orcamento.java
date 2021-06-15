package padroes.p04.builder.cenario04_step_builder;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	private String nome;
	private double valor;

	List<Item> itens;

	public Orcamento(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
		itens = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	
	public List<Item> getItens() {
		return itens;
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}

}
