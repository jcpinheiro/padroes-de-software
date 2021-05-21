package solid.p01.coesao_SRP.cenario1.parte3;

import java.util.HashMap;

public class GerenciadorDeDividas {
	
    private HashMap<String, Divida> dividas = 
                                   new HashMap<String, Divida>();
 
	public void registraDivida(String credor, String cnpjCredor, double valor) {
		
    Divida divida = new Divida();
    divida.setTotal(valor);
    divida.setCredor(credor);
    divida.setCnpjCredor(cnpjCredor);
    dividas.put(cnpjCredor, divida);
  } 

  public void pagaDivida(String cnpjCredor, Pagamento pagamento) {
	  
    Divida divida = dividas.get(cnpjCredor);
    
    if (divida != null) {
    	
    	//divida.getPagamentos().add(pagamento);
    	//divida.paga(pagamento.getValor() );
      
      divida.registra(pagamento);
    }
    
    
  }
  
}
