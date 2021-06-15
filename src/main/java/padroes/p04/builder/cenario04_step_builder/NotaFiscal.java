package padroes.p04.builder.cenario04_step_builder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private LocalDate dataDeEmissao;
	private BigDecimal valorBruto;
	private BigDecimal impostos;
	private List<Item> itens;
	public String observacoes;

	NotaFiscal() {

	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public LocalDate getDataDeEmissao() {
		return dataDeEmissao;
	}
	// public Calendar getDataDeEmissao() {
	// return dataDeEmissao;
	// }

	public BigDecimal getValorBruto() {
		return valorBruto;
	}

	public BigDecimal getImpostos() {
		return impostos;
	}

	public List<Item> getItens() {
		return itens;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public BigDecimal getValorTotal() {
		BigDecimal valorTotal = this.valorBruto.add(impostos);
		System.out.println(valorTotal);
		return valorTotal;
	}

	void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	void setDataDeEmissao(LocalDate dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
	}
	// void setDataDeEmissao(Calendar dataDeEmissao) {
	// this.dataDeEmissao = dataDeEmissao;
	// }

	void setValorBruto(BigDecimal valorBruto) {
		this.valorBruto = valorBruto;
	}

	void setImpostos(BigDecimal impostos) {
		this.impostos = impostos;
	}

	void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public void adicionaItens(List<Item> itens) {

		this.itens = itens;

		this.valorBruto = BigDecimal.ZERO;
		this.impostos = BigDecimal.ZERO;

		for (Item item : itens) {
			this.valorBruto = this.valorBruto.add(item.getSubTotal());
			this.impostos = this.impostos.add(item.getValorUnitario().multiply(new BigDecimal("0.05")));
		}

	}
	// public void adiciona(Item item) {
	//
	// if (this.itens == null) {
	// this.itens = new ArrayList<>();
	// this.valorBruto = BigDecimal.ZERO;
	// this.impostos = BigDecimal.ZERO;
	// }
	//
	// this.itens.add(item);
	// this.valorBruto = this.valorBruto.add(item.getSubTotal());
	// this.impostos = this.impostos.add(item.getValorUnitario().multiply(new
	// BigDecimal("0.05")));
	// }

	public int getQuantidadeDeItens() {
		return itens.size();
	}

}