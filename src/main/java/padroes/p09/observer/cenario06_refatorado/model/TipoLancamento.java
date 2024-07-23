package padroes.p09.observer.cenario06_refatorado.model;

public enum TipoLancamento {

	DESPESA("Despesa"),
	RECEITA("Receita");
	
	private String descricao;
	
	TipoLancamento(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
}
