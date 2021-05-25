package solid.p01.coesao_SRP.cenario1.parte3;

import java.time.LocalDate;

public class Pagamento {
	
	private String pagador;
	private LocalDate data;
	private double valor;

	public String getPagador() {
		return this.pagador;
	}

	public void setPagador(String pagador) {
		this.pagador = pagador;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
