package padroes.p07.abstractfactory.cenario04_refatorado.gestorderisco;

import java.math.BigDecimal;

public interface GestorDeRisco {
	public void avaliarRisco(String cartao, BigDecimal valor) throws AlertaDeRiscoException;
	
}
