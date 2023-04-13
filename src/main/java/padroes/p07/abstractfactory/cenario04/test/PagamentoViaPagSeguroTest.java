package padroes.p07.abstractfactory.cenario04.test;


import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import padroes.p07.abstractfactory.cenario04.gestorderisco.AlertaDeRiscoException;
import padroes.p07.abstractfactory.cenario04.gestorderisco.FControl;
import padroes.p07.abstractfactory.cenario04.operadora.CapturaNaoAutorizadaException;
import padroes.p07.abstractfactory.cenario04.operadora.Cielo;
import padroes.p07.abstractfactory.cenario04.pagamento.PagamentoPagSeguro;

import static org.junit.Assert.assertNotNull;

public class PagamentoViaPagSeguroTest {

	private PagamentoPagSeguro pagamento;
	
	@Before
	public void init() {
		Cielo cielo = new Cielo();
		FControl fcontrol = new FControl();
		pagamento = new PagamentoPagSeguro(cielo, fcontrol);
	}
	
	@Test
	public void deveAutorizarVenda() throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
		Long codigoAutorizacao = pagamento.autorizar("2222.2222", new BigDecimal("200"));
		assertNotNull(codigoAutorizacao);
	}
	
	@Test(expected=CapturaNaoAutorizadaException.class)
	public void deveNegarCaptura_cartaoInvalido() throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
		pagamento.autorizar("5555.2222", new BigDecimal("2000"));
	}
	
	@Test(expected=AlertaDeRiscoException.class)
	public void deveGerarAlertaDeRisco() throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
		pagamento.autorizar("7777.2222", new BigDecimal("5500"));
	}
	
}
