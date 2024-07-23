package padroes.p07.abstractfactory.cenario03_refatorado.test;


import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import padroes.p07.abstractfactory.cenario03_refatorado.gestorderisco.AlertaDeRiscoException;
import padroes.p07.abstractfactory.cenario03_refatorado.operadora.CapturaNaoAutorizadaException;
import padroes.p07.abstractfactory.cenario03_refatorado.pagamento.ModuloPagamentoFactory;
import padroes.p07.abstractfactory.cenario03_refatorado.pagamento.Pagamento;
import padroes.p07.abstractfactory.cenario03_refatorado.pagamento.pagseguro.PagSeguroModuloPagamentoFactory;

public class PagamentoViaPagSeguroTest {

	private Pagamento pagamento;
	
	@BeforeEach
	public void init() {
		ModuloPagamentoFactory moduloPagamentoFactory = new PagSeguroModuloPagamentoFactory();
		pagamento = new Pagamento(moduloPagamentoFactory);
	}
	
	@Test
	public void deveAutorizarVenda() throws CapturaNaoAutorizadaException, AlertaDeRiscoException {

		Long codigoAutorizacao = pagamento.autorizar("2222.2222", new BigDecimal("200"));
		Assertions.assertNotNull(codigoAutorizacao);
	}
	
	@Test //(expected=CapturaNaoAutorizadaException.class)
	public void deveNegarCaptura_cartaoInvalido() throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
		Assertions.assertThrows( CapturaNaoAutorizadaException.class,
				() -> pagamento.autorizar("5555.2222", new BigDecimal("2000") ),
						"Deveria lançar a exceção CapturaNaoAutorizadaException" );
	}

	@Test  //(expected=AlertaDeRiscoException.class)
	public void deveGerarAlertaDeRisco() throws CapturaNaoAutorizadaException, AlertaDeRiscoException {

		Assertions.assertThrows( AlertaDeRiscoException.class,
				() ->  pagamento.autorizar("7777.2222", new BigDecimal("5500")),
				"Deveria lançar a exceção AlertaDeRiscoException" );
	}
	
}
