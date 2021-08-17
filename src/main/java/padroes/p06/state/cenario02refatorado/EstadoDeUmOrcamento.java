package padroes.p06.state.cenario02refatorado;

interface EstadoDeUmOrcamento {
	void aplicaDescontoExtra(Orcamento orcamento);

	void aprova(Orcamento orcamento);

	void reprova(Orcamento orcamento);

	void finaliza(Orcamento orcamento);

}
