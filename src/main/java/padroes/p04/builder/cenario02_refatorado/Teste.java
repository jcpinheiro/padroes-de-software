package padroes.p04.builder.cenario02_refatorado;

import java.util.List;

class Teste {
  public static void main(String[] args) {
    List<Item> itens = List.of(
            new Item("Caneta", 10),
            new Item("Lápis", 5),
            new Item("Colar Branca", 8)
    );

  /*  double valorTotal = 0;
    for(Item item : itens) {
      valorTotal = valorTotal +  item.getValor();
    }
    double impostos = valorTotal * 0.05;

    NotaFiscal notaFiscal =  new NotaFiscal("razao social qualquer",
                    "50.683.875/0001-03", LocalDate.now(), valorTotal,
                    impostos, itens,"observacoes quaisquer aqui");

    System.out.println(notaFiscal) ;*/

    NotaFiscal nf =
          new NotaFiscalBuilder()

            .comCnpj("123.456.789/0001-10")
            .paraEmpresa("Empresa XYZ")
            .comItem(new Item("item 1", 100.0))
            .comItem(new Item("item 2", 200.0))
            .comItem(new Item("item 3", 300.0))
            .naDataAtual()
            .comObservacoes("entregar nf pessoalmente")
            .constroi();

    System.out.println("-----------------------------");
    System.out.println(nf );
  }
}
