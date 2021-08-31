package padroes.p08.decorator.cenario03;

public abstract class DecoradorDeImposto implements Imposto {
	
	private Imposto outroImposto;

	public DecoradorDeImposto() {
		// TODO Auto-generated constructor stub
	}
	
	public DecoradorDeImposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	
	@Override
	public abstract double calcula(Orcamento orcamento);
	
	protected double calculaOutroImposto(Orcamento orcamento) {
		
		if (this.outroImposto != null) {
			return this.outroImposto.calcula(orcamento);
		} else {
			return 0;
		}
	}
}
