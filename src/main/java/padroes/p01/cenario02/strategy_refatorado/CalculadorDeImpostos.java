package padroes.p01.cenario02.strategy_refatorado;

public class CalculadorDeImpostos {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto){

            double valor = imposto.calcula(orcamento );
            System.out.println(valor );

    }
}
