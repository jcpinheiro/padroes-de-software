package solid.p01.coesao_SRP.cenario1.parte4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class Divida {

	private double total;
	private double valorPago;
	private String credor;
	private String cnpjCredor;

	private final List<Pagamento> pagamentos = new ArrayList<>();

	public boolean cnpjValido() {
		return primeiroDigitoVerificadorDoCnpj() == primeiroDigitoCorretoParaCnpj()
				&& segundoDigitoVerificadorDoCnpj() == segundoDigitoCorretoParaCnpj();
	}

	public String getCnpjCredor() {
		return this.cnpjCredor;
	}

	public String getCredor() {
		return this.credor;
	}

	public double getTotal() {
		return this.total;
	}

	public double getValorPago() {
		return this.valorPago;
	}

	private void paga(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor invalido para pagamento");
		}
		if (valor > 10000) {
			valor = valor - 8;
		}
		this.valorPago += valor;
	}

	public List<Pagamento> pagamentosAntesDe(LocalDate data) {
		return this.pagamentos
				.stream()
				.filter(pagamento -> pagamento.getData().isBefore(data) )
				.collect(Collectors.toList() );
/*
		List<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();

		for (Pagamento pagamento : this.pagamentos) {
			if (pagamento.getData().isBefore(data) ) {
				pagamentosFiltrados.add(pagamento);
			}
		}

		return pagamentosFiltrados;
*/
	}

	public List<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
		return this.pagamentos
				.stream()
				.filter(pagamento -> pagamento.getValor() > valorMinimo)
				.collect(Collectors.toList() );
/*
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this.pagamentos) {
			if (pagamento.getValor() > valorMinimo) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
*/
	}

	private int primeiroDigitoCorretoParaCnpj() {
		return 0;
	}

	private int primeiroDigitoVerificadorDoCnpj() {
		return 0;
	}

	public void registra(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		paga(pagamento.getValor());
	}

	private int segundoDigitoCorretoParaCnpj() {
		return 0;
	}

	private int segundoDigitoVerificadorDoCnpj() {
		return 0;
	}

	public void setCnpjCredor(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double valorAPagar() {
		return this.total - this.valorPago;
	}
}
