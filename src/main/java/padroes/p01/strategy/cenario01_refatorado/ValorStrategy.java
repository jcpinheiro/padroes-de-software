package padroes.p01.strategy.cenario01_refatorado;

public class ValorStrategy implements DescontoStrategy {

     @Override
     public double calculaDesconto(Pedido pedido) {
          double desconto = 0;
          if (pedido.getTotal() > 1000)
              desconto = pedido.getTotal() * 0.15;

          else if (pedido.getTotal() > 500)
              desconto = pedido.getTotal() * 0.10;

          return desconto;
     }
 }