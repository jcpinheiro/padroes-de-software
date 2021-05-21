package solid.p01.coesao_SRP.cenario1_refatorado.parte1;

import java.util.HashMap;

/*Cenário: Essa classe é utilizada pelo BalancoEmpresa para registrar e atualizar dívidas. 
O método que registra dívidas cria uma instância de Divida, preenche o valor, 
com os dados do credor e guarda essa dívida num mapa em que a chave é o CNPJ do credor.*/

public class BalancoEmpresa {

	private HashMap<String, Divida> dividas = new HashMap<String, Divida>();

	public void registraDivida(Divida divida) {
     	dividas.put(divida.getCnpjCredor(), divida);
	}

	public void pagaDivida(String cnpjCredor, double valor) {
		
		Divida divida = dividas.get(cnpjCredor);
		if (divida != null) {
			divida.paga(valor );
		} else {
			throw new IllegalArgumentException("CNPJ não cadastrado!!");
		}
	}

}
