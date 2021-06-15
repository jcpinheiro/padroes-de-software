package padroes.p01.strategy.cenario02_refatorado;

public class CalculadorDeImpostos {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto){

            double valor = imposto.calcula(orcamento );
            System.out.println(valor );

    }
}
