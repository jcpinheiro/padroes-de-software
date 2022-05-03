package padroes.p08.decorator.cenario03;

public class ISS extends DecoradorDeImposto {
	
	public ISS() {
		// TODO Auto-generated constructor stub
	}
	
	public ISS(Imposto outroImposto ) {
		super(outroImposto);
		System.out.println("ISS");
	}
	
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + 
				calculaOutroImposto(orcamento);
	}

}
