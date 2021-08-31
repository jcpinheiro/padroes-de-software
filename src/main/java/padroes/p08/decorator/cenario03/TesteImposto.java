package padroes.p08.decorator.cenario03;

public class TesteImposto {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(600);
		
		Imposto icmsComISS = new ICMS( new ISS() );

		CalculadorDeImpostos calculadora = new CalculadorDeImpostos();
		
		calculadora.realizaCalculo(orcamento, icmsComISS);
		
	}
}
