package padroes.p09.observer.cenario02;

public class EnviadorDeSMS implements AcaoAposGerarNotaFiscal {
	
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviada por SMS");
		
	}

}
