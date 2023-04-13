package padroes.p07.abstractfactory.cenario04_refatorado.pagamento;

import padroes.p07.abstractfactory.cenario04_refatorado.gestorderisco.AlertaDeRiscoException;
import padroes.p07.abstractfactory.cenario04_refatorado.gestorderisco.GestorDeRisco;
import padroes.p07.abstractfactory.cenario04_refatorado.operadora.CapturaNaoAutorizadaException;
import padroes.p07.abstractfactory.cenario04_refatorado.operadora.Operadora;

import java.math.BigDecimal;

public class Pagamento {
	
	private Operadora operadora;
	private GestorDeRisco gestorDeRisco;

	public Pagamento(ModuloPagamentoFactory moduloPagamentoFactory) {
	    this.operadora = moduloPagamentoFactory.criarOperadora();
	    this.gestorDeRisco = moduloPagamentoFactory.criarGestorDeRisco();
    }

	public Long autorizar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
		this.operadora.capturar(cartao, valor);
		this.gestorDeRisco.avaliarRisco(cartao, valor);
		return this.operadora.confirmar();
    }

}
