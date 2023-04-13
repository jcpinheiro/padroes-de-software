package padroes.p07.abstractfactory.cenario04.pagamento;

import padroes.p07.abstractfactory.cenario04.gestorderisco.AlertaDeRiscoException;
import padroes.p07.abstractfactory.cenario04.gestorderisco.FControl;
import padroes.p07.abstractfactory.cenario04.operadora.CapturaNaoAutorizadaException;
import padroes.p07.abstractfactory.cenario04.operadora.Cielo;

import java.math.BigDecimal;

public class PagamentoPagSeguro {
	
	private Cielo operadora;
	private FControl gestorDeRisco;

	public PagamentoPagSeguro(Cielo operadora, FControl gestorDeRisco) {
	    this.operadora = operadora;
	    this.gestorDeRisco = gestorDeRisco;
    }

	public Long autorizar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException,
		                                        	              AlertaDeRiscoException {
		this.operadora.capturar(cartao, valor);
		this.gestorDeRisco.avaliarRisco(cartao, valor);
		return this.operadora.confirmar();
    }

}
