package padroes.p09.observer.cenario02;

public class Orcamento {
	
	private static final int EM_APROVACAO = 0;
	private static final int APROVADO = 1;
	private static final int REPROVADO = 2;
	private static final int FINALIZADO = 3;
	
	private int estadoAtual ;
	
	private double valor;

	public Orcamento(double valor) {
		this.valor = valor;
		this.estadoAtual = EM_APROVACAO;
		
	}
	
	public void aplicaDescontoExtra() {
		if (estadoAtual == EM_APROVACAO) {
			this.valor -= this.valor * 0.05;
		
		} else if (estadoAtual == APROVADO) {
			this.valor -= this.valor * 0.02;
			
		} else {
			throw new RuntimeException("Orcamento Reprovado ou Finalizado n�o se aplica desconto extra");
		}
	}
	
	public void aprova() {
		switch (estadoAtual) {
		
		case EM_APROVACAO:
			estadoAtual = APROVADO;
			break;
		case APROVADO:
			throw new RuntimeException("Orcamento j� foi aprovado previamente");
		
		case REPROVADO:
			throw new RuntimeException("Orcamento REPROVADO n�o pode ser Aprovado");
		
		case FINALIZADO:
			throw new RuntimeException("Orcamento j� Finalizado");
		}
	}
	public void reprova() {
		switch (estadoAtual) {
		
		case EM_APROVACAO:
		case APROVADO:
			estadoAtual = REPROVADO;
			break;
		case REPROVADO:
			throw new RuntimeException("Orcamento j� foi REPROVADO anteriormete");
		
		case FINALIZADO:
			throw new RuntimeException("Orcamento j� Finalizado");
		}
	}	
	
	public void finaliza() {
		switch (estadoAtual) {
		
		case EM_APROVACAO:
			throw new RuntimeException("Orcamento EM_APROVA��O n�o pode ser finalizado");
		
		case APROVADO:
		case REPROVADO:
			estadoAtual = FINALIZADO;
			break;
		
		case FINALIZADO:
			throw new RuntimeException("Orcamento j� Finalizado");
		}
	}	

	public double getValor() {
		return valor;
	}

}
