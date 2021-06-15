package padroes.p04.builder.cenario04_step_builder;

import java.time.LocalDate;
import java.util.List;

public class NotaFiscalStepBuilder {

	// vamos obrigar o uso do método newBuilder()
	private NotaFiscalStepBuilder() {
	}

	// factory method
	public static RazaoSocialStep newBuilder() {
		return new Steps();
	}

	// passos para criação do pipeline de objetos
	public static interface RazaoSocialStep {
		CnpjStep paraEmpresa(String razaoSocial);
	}

	public static interface CnpjStep {
		ItensStep comCNPJ(String cnpj);
	}

	public static interface ItensStep {
		ObservacoesStep comItens(List<Item> itens);
	}

	public static interface ObservacoesStep {
		DataDeEmissaoStep comObservacoes(String observacoes);
	}

	public static interface DataDeEmissaoStep {
		ConstroiStep naDataAtual();
	}

	public static interface ConstroiStep {
		NotaFiscal constroi();
	}

	// classe interna Steps que implementa o pipeline com todos os passos
	private static class Steps
			implements RazaoSocialStep, CnpjStep, ItensStep, 
			ObservacoesStep, DataDeEmissaoStep, ConstroiStep {

		
		private NotaFiscal notaFiscal;
		
		
		@Override
		public CnpjStep paraEmpresa(String razaoSocial) {
			this.notaFiscal = new NotaFiscal();
			this.notaFiscal.setRazaoSocial(razaoSocial);
			return this;
		}

		@Override
		public ItensStep comCNPJ(String cnpj) {
			this.notaFiscal.setCnpj(cnpj);
			return this;
		}

		@Override
		public ObservacoesStep comItens(List<Item> itens) {
			this.notaFiscal.adicionaItens(itens);
			return this;
		}
		
		@Override
		public DataDeEmissaoStep comObservacoes(String observacoes) {
			this.notaFiscal.setObservacoes(observacoes);
			return this;
		}


		@Override
		public ConstroiStep naDataAtual() {
			this.notaFiscal.setDataDeEmissao( LocalDate.now() );
			return this;
		}

		@Override
		public NotaFiscal constroi() {
			return this.notaFiscal;
		}
	}
}

