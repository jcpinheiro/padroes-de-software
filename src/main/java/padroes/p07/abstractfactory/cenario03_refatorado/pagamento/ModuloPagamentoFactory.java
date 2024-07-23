package padroes.p07.abstractfactory.cenario03_refatorado.pagamento;

import padroes.p07.abstractfactory.cenario03_refatorado.gestorderisco.GestorDeRisco;
import padroes.p07.abstractfactory.cenario03_refatorado.operadora.Operadora;

public interface ModuloPagamentoFactory {

	public Operadora criarOperadora();
	public GestorDeRisco criarGestorDeRisco();
	
}
