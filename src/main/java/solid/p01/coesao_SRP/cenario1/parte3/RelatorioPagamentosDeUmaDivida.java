package solid.p01.coesao_SRP.cenario1.parte3;

public class RelatorioPagamentosDeUmaDivida {
	
	
	public void imprimePagamentosDa(Divida divida) {
		Iterable<Pagamento> pagamentos = divida.getPagamentos();
		pagamentos.forEach(System.out::println );

		/*
		for (Pagamento pagamento : pagamentos) {
			System.out.println(pagamento.getValor() );
		}
*/

	}

}
