package padroes.p06.state.cenario02;

public class CalculadoraDeImpostos {


    public void realizaCalculo(Orcamento orcamento, Imposto imposto ) {
        double valorDoImposto = imposto.calcula(orcamento);
        System.out.println(valorDoImposto );

    }

}
