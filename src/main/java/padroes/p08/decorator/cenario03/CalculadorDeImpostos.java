package padroes.p08.decorator.cenario03;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, 
			                   Imposto impostoQualquer) {

		    double imposto = impostoQualquer.calcula(orcamento);
			System.out.println(imposto);
    	} 
	}
	

