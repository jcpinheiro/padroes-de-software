package solid.p01.coesao_SRP.cenario1.parte5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

final class HistoricoPagamentos {
	
	private final List<Pagamento> pagamentos = new ArrayList<>();
	
	private double valorPago;

	void registra(Pagamento pagamento) {
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

	List<Pagamento> pagamentosAntesDe(LocalDate data) {
		return this.pagamentos
				.stream()
				.filter(pagamento ->   pagamento.getData().isBefore(data) )
				.collect(Collectors.toList() );
	}

	List<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
		return this.pagamentos
				.stream()
				.filter(pagamento -> pagamento.getValor() > valorMinimo)
				.collect(Collectors.toList() );

	}
	double getValorPago() {
		return this.valorPago;
	}

	
}
