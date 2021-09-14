package padroes.p09.observer.cenario02;

public class NotaFiscalDAO implements AcaoAposGerarNotaFiscal {
	
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Nota fiscal salva no Banco de Dados");
		
	}


}
