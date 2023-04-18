package padroes.p09.observer.cenario05_refatorado.listeners;

import padroes.p09.observer.cenario05_refatorado.model.Lancamento;
import padroes.p09.observer.cenario05_refatorado.notifier.Notificador;

import java.util.List;

public class EmailListener implements Listener {

	private Notificador notificador;
	
	public EmailListener(Notificador notificador) {
		this.notificador = notificador;
		this.notificador.registrarListener(this);
    }

	@Override
    public void atualizar() {
		List<Lancamento> lancamentosVencidos = this.notificador.getLancamentosVencidos();
		
		for (Lancamento lancamento : lancamentosVencidos) {
			System.out.println("Enviando e-mail para " + lancamento.getPessoa().getEmail());
		}
		
		// this.notificador.removerListener(this);
    }

}
