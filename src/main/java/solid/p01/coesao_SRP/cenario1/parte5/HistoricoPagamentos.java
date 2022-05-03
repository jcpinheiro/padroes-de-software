package solid.p01.coesao_SRP.cenario1.parte5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class HistoricoPagamentos {
	
	private final List<Pagamento> pagamentos = new ArrayList<>();
	
	private double valorPago;

	public void registra(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		paga(pagamento.getValor());
	}
	
	private void paga(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor invalido para pagamento");
		}
		if (valor > 100) {
			valor = valor - 8;
		}
		this.valorPago += valor;
	}

	public List<Pagamento> pagamentosAntesDe(LocalDate data) {
		return this.pagamentos
				.stream()
				.filter(pagamento ->   pagamento.getData().isBefore(data) )
				.collect(Collectors.toList() );
	}

	public List<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
		return this.pagamentos
				.stream()
				.filter(pagamento -> pagamento.getValor() > valorMinimo)
				.collect(Collectors.toList() );

	}
	public double getValorPago() {
		return this.valorPago;
	}

	
}
