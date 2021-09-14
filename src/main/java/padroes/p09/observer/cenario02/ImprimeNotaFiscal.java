package padroes.p09.observer.cenario02;

public class ImprimeNotaFiscal implements AcaoAposGerarNotaFiscal {
	
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Imprimindo relatório ...");
		
	}
}
