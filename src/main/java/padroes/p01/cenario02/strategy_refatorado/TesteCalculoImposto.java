package padroes.p01.cenario02.strategy_refatorado;

public class TesteCalculoImposto {

    public static void main(String[] args ) {
       Imposto icms = new ICMS();
       Imposto iss = new ISS();

       Orcamento orcamento = new Orcamento(100);

       CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
       calculadorDeImpostos.realizaCalculo(orcamento, iss );
        calculadorDeImpostos.realizaCalculo(orcamento, icms );

    }
}
