package padroes.p07.abstractfactory.cenario03_refatorado.gestorderisco.fcontrol;

import padroes.p07.abstractfactory.cenario03_refatorado.gestorderisco.AlertaDeRiscoException;
import padroes.p07.abstractfactory.cenario03_refatorado.gestorderisco.GestorDeRisco;

import java.math.BigDecimal;

public class FControl implements GestorDeRisco {

	@Override
	public void avaliarRisco(String cartao, BigDecimal valor) throws AlertaDeRiscoException {
		if (cartao.startsWith("7777")) {
			throw new AlertaDeRiscoException("Cartão suspeito.");
		}
    }

}
