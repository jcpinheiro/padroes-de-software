package padroes.p08.decorator.cenario03;

public class CPMF extends DecoradorDeImposto {
	
	public CPMF() {
		System.out.println("CPMF");
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.038 ;
	}
}
