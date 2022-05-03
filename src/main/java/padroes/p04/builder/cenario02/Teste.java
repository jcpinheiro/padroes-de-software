package padroes.p04.builder.cenario02;

import java.time.LocalDate;
import java.util.List;

class Teste {
  public static void main(String[] args) {
    List<Item> itens = List.of(
           new Item("Caneta", 10),
           new Item("Lápis", 5),
           new Item("Colar Branca", 8)
    );

    double valorTotal = 0;
    for(Item item : itens) {
      valorTotal = valorTotal +  item.getValor();
    }
    double impostos = valorTotal * 0.05;

    NotaFiscal notaFiscal =  new NotaFiscal("razao social qualquer",
                    "50.683.875/0001-03", LocalDate.now(), valorTotal,
                    impostos, itens,"observacoes quaisquer aqui");

    System.out.println(notaFiscal) ;

  }
}
