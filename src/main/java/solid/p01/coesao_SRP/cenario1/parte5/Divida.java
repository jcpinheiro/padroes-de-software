package solid.p01.coesao_SRP.cenario1.parte5;

public class Divida {
	
	private final double total;
	private String credor;
	private Cnpj cnpjCredor;
	
	private final Pagamentos pagamentos= new Pagamentos();

	public Divida(double total) {
		this.total = total;
	}

	public Cnpj getCnpjCredor() {
		return this.cnpjCredor;
	}

	public void setCnpjCredor(Cnpj cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
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
		return this.total - this.pagamentos.getValorPago();
	}
}
