package padroes.p07.abstractfactory.cenario04_refatorado.pagamento;

import padroes.p07.abstractfactory.cenario04_refatorado.gestorderisco.GestorDeRisco;
import padroes.p07.abstractfactory.cenario04_refatorado.operadora.Operadora;

public interface ModuloPagamentoFactory {

	public Operadora criarOperadora();
	public GestorDeRisco criarGestorDeRisco();
	
}
