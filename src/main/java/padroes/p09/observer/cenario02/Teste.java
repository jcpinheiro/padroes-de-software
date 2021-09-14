package padroes.p09.observer.cenario02;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

class Teste {
	public static void main(String[] args) {
		
		AcaoAposGerarNotaFiscal imprime = new ImprimeNotaFiscal();
		AcaoAposGerarNotaFiscal enviaEmail = new EnviadorDeEmail();
		

		NotaFiscalBuilder notaFiscalBuilder = new NotaFiscalBuilder();
		
		notaFiscalBuilder.adiciona(imprime);
		notaFiscalBuilder.adiciona(enviaEmail);
		
		NotaFiscal notaFiscal = notaFiscalBuilder
				
				.paraEmpresa("Empresa XYZ").comCnpj("23.456.789/0001-12")
				.adiciona(new ItemDaNota("Tablet", 1500))
				.adiciona(new ItemDaNota("Notebook", 1500))
				.naDataAtual()
				.comObservacoes("Observação qualquer")
				.constroi();

		// e assim por diante...


	}
}
