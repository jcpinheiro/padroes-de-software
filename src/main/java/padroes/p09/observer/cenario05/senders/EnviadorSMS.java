package padroes.p09.observer.cenario05.senders;

import padroes.p09.observer.cenario05.model.Lancamento;

import java.util.List;


public class EnviadorSMS {

    public void enviar(List<Lancamento> lancamentosVencidos) {
		for (Lancamento lancamento : lancamentosVencidos) {
			System.out.println("Enviando SMS para " + lancamento.getPessoa().getTelefone());
		}
    }

}
