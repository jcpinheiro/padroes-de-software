package padroes.p07.abstractfactory.cenario03_refatorado.gestorderisco;

import java.math.BigDecimal;

public interface GestorDeRisco {
	public void avaliarRisco(String cartao, BigDecimal valor) throws AlertaDeRiscoException;
	
}
