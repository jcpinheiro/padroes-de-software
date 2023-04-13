package solid.p01.coesao_SRP.cenario1.parte4;

import solid.p01.coesao_SRP.cenario1.parte3.Divida;
import solid.p01.coesao_SRP.cenario1.parte3.Pagamento;

import java.util.HashMap;

public class GerenciadorDeDividas {
	
    private HashMap<String, solid.p01.coesao_SRP.cenario1.parte3.Divida> dividas =
                                   new HashMap<String, solid.p01.coesao_SRP.cenario1.parte3.Divida>();
 
	public void registraDivida(String credor, String cnpjCredor, double total) {
		
    solid.p01.coesao_SRP.cenario1.parte3.Divida divida = new solid.p01.coesao_SRP.cenario1.parte3.Divida(total );
    divida.setCredor(credor);
    divida.setCnpjCredor(cnpjCredor);
    dividas.put(cnpjCredor, divida);
  } 

  public void pagaDivida(String cnpjCredor, Pagamento pagamento) {
	  
    Divida divida = dividas.get(cnpjCredor);
    
    if (divida != null) {
    	/*divida.getPagamentos().add(pagamento);
    	divida.paga(pagamento.getValor() );*/

      divida.registra(pagamento);
    }
    
    
  }
  
}
