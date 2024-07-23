package padroes.p07.abstractfactory.cenario03.gestorderisco;

import java.math.BigDecimal;

public class FControl {

	public void avaliarRisco(String cartao, BigDecimal valor) throws AlertaDeRiscoException {
		if (cartao.startsWith("7777")) {
			throw new AlertaDeRiscoException("Cartão suspeito.");
		}
		// ...
    }

}
