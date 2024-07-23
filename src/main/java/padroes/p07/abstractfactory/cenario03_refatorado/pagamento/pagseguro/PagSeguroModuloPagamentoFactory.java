package padroes.p07.abstractfactory.cenario03_refatorado.pagamento.pagseguro;


import padroes.p07.abstractfactory.cenario03_refatorado.gestorderisco.GestorDeRisco;
import padroes.p07.abstractfactory.cenario03_refatorado.gestorderisco.fcontrol.FControl;
import padroes.p07.abstractfactory.cenario03_refatorado.operadora.Operadora;
import padroes.p07.abstractfactory.cenario03_refatorado.operadora.cielo.Cielo;
import padroes.p07.abstractfactory.cenario03_refatorado.pagamento.ModuloPagamentoFactory;

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
