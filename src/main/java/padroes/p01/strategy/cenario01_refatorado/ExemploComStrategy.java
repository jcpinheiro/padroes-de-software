package padroes.p01.strategy.cenario01_refatorado;

public class ExemploComStrategy {
 
     public static void main(String[] args) {
         //inicialização do pedido
         Produto p1 = new Produto("Camiseta Casual Class", 400, 30.0);
         Produto p2 = new Produto("Bermuda jeans", 200, 60.0);

         Cliente cliente = new Cliente("Carlos da Silva");

         Pedido pedido = new Pedido();
         pedido.adiciona(new Item(p1, 10),
                         new Item(p2, 15) );

         pedido.setCliente(cliente );
         pedido.setFormaDePagamento(FormaPagamento.APRAZO );
 
         //configuração da estratégia para cálculo de desconto
         DescontoStrategy desconto = new ValorStrategy();
         pedido.setStrategy(desconto );

         double totalComDesconto = pedido.getTotalComDesconto();
         System.out.println("Valor do pedido com desconto:" +
                 totalComDesconto);
     }
 }