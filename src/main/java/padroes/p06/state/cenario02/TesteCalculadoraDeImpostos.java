package padroes.p06.state.cenario02;

public class TesteCalculadoraDeImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(500);

        Imposto icms = new ICMS();
        Imposto iss = new ISS();
        Imposto iof = new IOF();


        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        calculadora.realizaCalculo(orcamento, icms );
        calculadora.realizaCalculo(orcamento, iss );
        calculadora.realizaCalculo(orcamento, iof );

    }
}
