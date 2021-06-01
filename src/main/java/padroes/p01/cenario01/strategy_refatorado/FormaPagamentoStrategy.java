package padroes.p01.cenario01.strategy_refatorado;

public class FormaPagamentoStrategy implements DescontoStrategy {
 
    public double calculaDesconto(Pedido pedido) {
        double desconto = 0;
        if (pedido.getFormaDePagamento().equals(FormaPagamento.APRAZO)) {
            desconto = pedido.getTotal() * 0.20;
        }
        if (pedido.getFormaDePagamento().equals(FormaPagamento.CARTAO)) {
            desconto = pedido.getTotal() * 0.05;
        }
        // if(...)
        return desconto;


    }
}