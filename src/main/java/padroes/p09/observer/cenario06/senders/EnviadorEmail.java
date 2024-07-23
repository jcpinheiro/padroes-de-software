package padroes.p09.observer.cenario06.senders;

import java.util.List;

import padroes.p09.observer.cenario06.model.Lancamento;

public class EnviadorEmail {
	
    public void enviar(List<Lancamento> lancamentosVencidos) {
		for (Lancamento lancamento : lancamentosVencidos) {
			System.out.println("Enviando e-mail para " + lancamento.getPessoa().getEmail());
		}
    }

}
