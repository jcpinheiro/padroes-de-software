package padroes.p09.observer.cenario02;

public class EnviadorDeEmail implements AcaoAposGerarNotaFiscal {

	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Encaminhado por email");
		
	}

}
