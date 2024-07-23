package padroes.p07.abstractfactory.cenario03_refatorado.pagamento.paypal;


import padroes.p07.abstractfactory.cenario03_refatorado.gestorderisco.GestorDeRisco;
import padroes.p07.abstractfactory.cenario03_refatorado.gestorderisco.clearsale.ClearSale;
import padroes.p07.abstractfactory.cenario03_refatorado.operadora.Operadora;
import padroes.p07.abstractfactory.cenario03_refatorado.operadora.redecard.Redecard;
import padroes.p07.abstractfactory.cenario03_refatorado.pagamento.ModuloPagamentoFactory;

public class PayPalModuloPagamentoFactory implements ModuloPagamentoFactory {

	@Override
    public Operadora criarOperadora() {
	    return new Redecard();
    }

	@Override
    public GestorDeRisco criarGestorDeRisco() {
        return new ClearSale();
    }

}
