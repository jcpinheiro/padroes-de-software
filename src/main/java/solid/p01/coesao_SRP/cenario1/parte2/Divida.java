/*Cenário: A classe Divida deve armazenar o credor (para quem a empresa está devendo), 
o CNPJ desse credor, o valor total da dívida e o seu valor já pago.*/

package solid.p01.coesao_SRP.cenario1.parte2;

public class Divida {
	
	private final double total;
	private double valorPago;
	private String credor;
	private String cnpjCredor;
	
	
	public Divida(double total) {
		this.total = total;
	}

	public double getTotal() {
		return this.total;
	}

	public double getValorPago() {
		return this.valorPago;
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

	public void paga(double valor) {
		// outras regras de negócio
		
		if (valor < 0) {
			throw new IllegalArgumentException("O valor pago não pode ser negativo");
		}
		this.valorPago = this.valorPago + valor;
		
	}
}
