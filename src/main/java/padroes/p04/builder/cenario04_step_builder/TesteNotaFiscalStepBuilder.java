package padroes.p04.builder.cenario04_step_builder;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class TesteNotaFiscalStepBuilder {
	
	public static void main(String[] args) {
		
		List<Item> produtosDeInformatica = List.of(
				      new Item("Monitor", new BigDecimal(500), 1),
				      new Item("Ultrabook", new BigDecimal(2400), 1),
				      new Item("Tablet", new BigDecimal(900), 1));

		NotaFiscalStepBuilder.newBuilder()
				.paraEmpresa("Empresa XYZ")
				.comCNPJ("23432.43434")
				.comItens(produtosDeInformatica )
				.comObservacoes("Sem Observação")
				.naDataAtual()
				.constroi();

		NotaFiscal nf = NotaFiscalStepBuilder.newBuilder()
										.paraEmpresa("Empresa Legal")
										.comCNPJ("123.456.00001/1234-0")
				                        .comItens(produtosDeInformatica)
				                        .comObservacoes("Digite a sua sugestão aqui")
				                        .naDataAtual()
				                        .constroi();

		System.out.println(nf.getValorBruto());
		System.out.println(nf.getImpostos());

	}

}
