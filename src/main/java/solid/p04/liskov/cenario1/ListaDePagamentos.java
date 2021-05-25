package solid.p04.liskov.cenario1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaDePagamentos extends ArrayList<Pagamento>{
	
	private double valorPago;

	public void registra(Pagamento pagamento) {
		this.add(pagamento);
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
		return this
				.stream()
				.filter(pagamento ->   pagamento.getData().isBefore(data) )
				.collect(Collectors.toList() );
	}

	public List<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
		return this
				.stream()
				.filter(pagamento -> pagamento.getValor() > valorMinimo)
				.collect(Collectors.toList() );

	}
	public double getValorPago() {
		return this.valorPago;
	}
}
