package solid.p01.coesao_SRP.cenario1.parte3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Divida {

	private double total;
	private double valorPago;
	private String credor;
	private String cnpjCredor;

	private final List<Pagamento> pagamentos = new LinkedList<>();

	public Divida(double total) {
		this.total = total;
	}

/*
	public List<Pagamento> getPagamentos() {
		return Collections.unmodifiableList(pagamentos );
	}
*/

	public Iterable<Pagamento> getPagamentos() {
		return pagamentos;
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

	private void paga(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor invalido");
		}
		if (valor > 10000) {
			valor = valor - 8;
		}
		this.valorPago += valor;
	}

	public void registra(Pagamento pagamento) {
		this.paga(pagamento.getValor() );
		this.pagamentos.add(pagamento);
	}
}
