package padroes.p09.observer.cenario05.senders;

import java.util.List;

import padroes.p09.observer.cenario05.model.Lancamento;

public class EnviadorEmail {
	
    public void enviar(List<Lancamento> lancamentosVencidos) {
		for (Lancamento lancamento : lancamentosVencidos) {
			System.out.println("Enviando e-mail para " + lancamento.getPessoa().getEmail());
		}
    }

}
