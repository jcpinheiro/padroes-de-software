package solid.p01.coesao_SRP.cenario1.parte6;

public class Divida {
	
	private final double total;
	private String credor;

	private Documento documentoCredor;

	public Documento getDocumentoCredor() {
		return documentoCredor;
	}

	public void setDocumentoCredor(Documento documentoCredor) {
		this.documentoCredor = documentoCredor;
	}

	private final HistoricoPagamentos historicoPagamentos = new HistoricoPagamentos();


	public Divida(double total) {
		this.total = total;
	}


	public String getCredor() {
		return this.credor;
	}

	public double getTotal() {
		return this.total;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public double valorAPagar() {
		return this.total - this.historicoPagamentos.getValorPago();
	}

	public void registra(Pagamento pagamento) {
		historicoPagamentos.registra(pagamento);
	}
}
