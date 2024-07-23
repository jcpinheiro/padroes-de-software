package padroes.p07.abstractfactory.cenario03_refatorado.operadora.redecard;

import padroes.p07.abstractfactory.cenario03_refatorado.operadora.CapturaNaoAutorizadaException;
import padroes.p07.abstractfactory.cenario03_refatorado.operadora.Operadora;

import java.math.BigDecimal;

public class Redecard implements Operadora {

	private Long codigoConfirmacao = -1L;

	@Override
	public void capturar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException {
		if (cartao.startsWith("2222") && valorMaiorQueLimite(valor)) {
			throw new CapturaNaoAutorizadaException("Valor maior que limite para cartão informado.");
		}

		this.codigoConfirmacao = (long) Math.random() * 300;
	}

	private boolean valorMaiorQueLimite(BigDecimal valor) {
		BigDecimal limite = new BigDecimal("1000");
		return valor.compareTo(limite) > 0;
	}

	@Override
	public Long confirmar() {
		System.out.println("Fazendo o débito na conta do cliente via Redecard");
		return this.codigoConfirmacao;
	}

}
