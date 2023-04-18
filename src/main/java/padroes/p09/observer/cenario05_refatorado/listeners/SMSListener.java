package padroes.p09.observer.cenario05_refatorado.listeners;

import padroes.p09.observer.cenario05_refatorado.model.Lancamento;
import padroes.p09.observer.cenario05_refatorado.notifier.Notificador;

import java.util.List;

public class SMSListener implements Listener {

	private Notificador notificador;
	
	public SMSListener(Notificador notificador) {
		this.notificador = notificador;
		this.notificador.registrarListener(this);
    }

	@Override
    public void atualizar() {
		List<Lancamento> lancamentosVencidos = this.notificador.getLancamentosVencidos();
		
		for (Lancamento lancamento : lancamentosVencidos) {
			System.out.println("Enviando SMS para " + lancamento.getPessoa().getTelefone());
		}
		
		// this.notificador.removerListener(this);
    }

}
