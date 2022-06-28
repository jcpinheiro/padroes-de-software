package padroes.p08.decorator.cenario03;

public class ICMS extends DecoradorDeImposto {

	public ICMS() {
	}

	public ICMS(Imposto outroImposto) {
		super(outroImposto );
		System.out.println("ICMS");
		
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.10 + 
				calculaOutroImposto(orcamento );
		
	}



}
