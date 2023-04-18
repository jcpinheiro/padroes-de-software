package padroes.p09.observer.cenario05_refatorado.notifier;

import padroes.p09.observer.cenario05_refatorado.listeners.Listener;
import padroes.p09.observer.cenario05_refatorado.model.Lancamento;

import java.util.List;

public interface Notificador {

	public void registrarListener(Listener listener);
	public void removerListener(Listener listener);
	public void notificarListeners();
	
	public void novosLancamentosVencidos(List<Lancamento> lancamentosVencidos);
	public List<Lancamento> getLancamentosVencidos();
	
}
