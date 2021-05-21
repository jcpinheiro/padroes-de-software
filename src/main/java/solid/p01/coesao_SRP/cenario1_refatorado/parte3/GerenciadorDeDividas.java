package solid.p01.coesao_SRP.cenario1_refatorado.parte3;

import java.util.HashMap;

public class GerenciadorDeDividas {
	
    private HashMap<String, Divida> dividas =
                                   new HashMap<String, Divida>();
 
	public void registraDivida(Divida divida) {
	   dividas.put(divida.getCnpjCredor(), divida);
  } 

  public void pagaDivida(String cnpjCredor, Pagamento pagamento) {
	  
    Divida divida = dividas.get(cnpjCredor);
    
    if (divida != null) {
      	//divida.getPagamentos().add(pagamento);
    	//divida.paga(pagamento.getValor() );

    	divida.registra(pagamento );

    }
    
    
  }
  
}
