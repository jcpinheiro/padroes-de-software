package padroes.p07.abstractfactory.cenario04_refatorado.pagamento.pagseguro;


import padroes.p07.abstractfactory.cenario04_refatorado.gestorderisco.GestorDeRisco;
import padroes.p07.abstractfactory.cenario04_refatorado.gestorderisco.fcontrol.FControl;
import padroes.p07.abstractfactory.cenario04_refatorado.operadora.Operadora;
import padroes.p07.abstractfactory.cenario04_refatorado.operadora.cielo.Cielo;
import padroes.p07.abstractfactory.cenario04_refatorado.pagamento.ModuloPagamentoFactory;

public class PagSeguroModuloPagamentoFactory implements ModuloPagamentoFactory {

	@Override
    public Operadora criarOperadora() {
	    return new Cielo();
    }

	@Override
    public GestorDeRisco criarGestorDeRisco() {
	    return new FControl();
    }

}
