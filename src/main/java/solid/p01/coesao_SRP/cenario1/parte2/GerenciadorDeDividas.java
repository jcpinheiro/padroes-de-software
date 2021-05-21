package solid.p01.coesao_SRP.cenario1.parte2;

import java.util.HashMap;
import java.util.Map;

/*Cenário: Essa classe é utilizada para registrar e atualizar dívidas. 
O método que registra dívidas cria uma instância de Divida, preenche o valor, 
os dados do credor e guarda essa dívida num mapa em que a chave é o CNPJ do credor.*/

public class GerenciadorDeDividas {

	private Map<String, Divida> dividas = new HashMap<>();

	public void registraDivida(String credor, String cnpjCredor, double valorTotal) {

		Divida divida = new Divida(valorTotal);

		divida.setCredor(credor);
		divida.setCnpjCredor(cnpjCredor);
		dividas.put(cnpjCredor, divida);
	}

	public void pagaDivida(String cnpjCredor, double valor) {
		
		Divida divida = dividas.get(cnpjCredor);
		if (divida != null) {
			divida.paga(valor );

		} else {
			throw new IllegalArgumentException("O CNPJ é inválido: " + cnpjCredor );
		}
	}

}
