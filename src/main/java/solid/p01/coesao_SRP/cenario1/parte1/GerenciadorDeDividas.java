package solid.p01.coesao_SRP.cenario1.parte1;

import java.util.HashMap;
import java.util.Objects;

/*Cenário: Registrar e atualizar dívidas.
O método que registra dívidas cria uma instância de Divida, preenche o valor, 
com os dados do credor e guarda essa dívida num mapa em que a chave é o CNPJ do credor.*/

public class GerenciadorDeDividas {

	private HashMap<String, Divida> dividas = new HashMap<String, Divida>();

	public void registraDivida(String credor, String cnpjCredor, double valor) {

		Divida divida = new Divida();

		divida.setTotal(valor);
		divida.setCredor(credor);
		divida.setCnpjCredor(cnpjCredor);

		dividas.put(cnpjCredor, divida);
	}

	public void pagaDivida(String cnpjCredor, double valor) {
		
		Divida divida = dividas.get(cnpjCredor);

		if (Objects.nonNull(divida) ) {

			divida.setValorPago(divida.getValorPago() + valor );
			//divida.setValorPago(1000 );
			//divida.paga(valor );
		}
	}

}
