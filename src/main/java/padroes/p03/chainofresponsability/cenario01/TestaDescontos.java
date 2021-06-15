package padroes.p03.chainofresponsability.cenario01;

public class TestaDescontos {
  public static void main(String[] args) {
    CalculadorDeDescontos calculador = new CalculadorDeDescontos();

      Orcamento orcamento = new Orcamento(150.0);

      orcamento.adiciona(new Item("CANETA", 25.0));
      orcamento.adiciona(new Item("LAPIS", 25.0));
      orcamento.adiciona(new Item("Papel a4", 25.0));
      orcamento.adiciona(new Item("Quadro Branco", 50.0));
 //     orcamento.adiciona(new Item("Grafite", 25.0));

      double desconto = calculador.calcula(orcamento );
 
      System.out.println(desconto);
 
  }
}
