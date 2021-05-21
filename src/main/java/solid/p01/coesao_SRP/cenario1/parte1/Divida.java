/*Cenário: A classe Divida deve armazenar o credor (para quem a empresa está devendo), 
o CNPJ desse credor, o valor total da dívida e o seu valor já pago.*/

package solid.p01.coesao_SRP.cenario1.parte1;

public class Divida {
	
	private double total;
	private double valorPago;
	private String credor;
	private String cnpjCredor;

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getValorPago() {
		return this.valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public String getCredor() {
		return this.credor;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public String getCnpjCredor() {
		return this.cnpjCredor;
	}

	public void setCnpjCredor(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}
}
