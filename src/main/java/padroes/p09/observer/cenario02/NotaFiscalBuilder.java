package padroes.p09.observer.cenario02;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private Calendar dataDeEmissao;
	private double valorBruto;
	private double impostos;
	public List<ItemDaNota> itens;
	public String observacoes;


	private List<AcaoAposGerarNotaFiscal> acoes;
 	
	public NotaFiscalBuilder() {
		itens = new ArrayList<ItemDaNota>();
		acoes = new ArrayList<AcaoAposGerarNotaFiscal>();
	}

	public void adiciona(AcaoAposGerarNotaFiscal acao) {
		acoes.add(acao);
	}
	
	
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder adiciona(ItemDaNota itemDaNota) {
		itens.add(itemDaNota);
		this.valorBruto = this.valorBruto + itemDaNota.getValor();
		this.impostos = this.valorBruto * 0.05;
		
		return this;
	}

	public NotaFiscalBuilder naDataAtual() {
		dataDeEmissao = Calendar.getInstance();
		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	public NotaFiscal constroi() {
		 NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, 
				 					dataDeEmissao, valorBruto, 
				 					impostos, itens, observacoes);
		
		 for (AcaoAposGerarNotaFiscal acao : acoes) {
			 acao.executa(notaFiscal);
		 }
		 
		 return notaFiscal;
	}

	


}
