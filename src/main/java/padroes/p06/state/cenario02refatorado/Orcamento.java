package padroes.p06.state.cenario02refatorado;

public class Orcamento {

	double valor;
	EstadoDeUmOrcamento estadoAtual;

	public Orcamento() {
		estadoAtual = new EmAprovacao();
	}

	public Orcamento(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void aprova() {
		estadoAtual.aprova(this);

	}

	public void reprova() {
		estadoAtual.reprova(this);
	}

	public void finaliza() {
		estadoAtual.finaliza(this);
	}

	// ... resto da classe aqui

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);

	}



	

}
