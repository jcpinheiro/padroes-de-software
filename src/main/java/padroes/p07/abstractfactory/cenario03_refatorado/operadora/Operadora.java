package padroes.p07.abstractfactory.cenario03_refatorado.operadora;

import java.math.BigDecimal;

public interface Operadora {

	public void capturar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException;
	public Long confirmar();
	
}
