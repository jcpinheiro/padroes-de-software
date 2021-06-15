package padroes.p01.strategy.cenario01_refatorado;

import static padroes.p01.strategy.cenario01_refatorado.FormaPagamento.APRAZO;
import static padroes.p01.strategy.cenario01_refatorado.FormaPagamento.CARTAO;

public class FormaPagamentoStrategy implements DescontoStrategy {
 
    public double calculaDesconto(Pedido pedido) {
        double desconto = 0;
        if (pedido.getFormaDePagamento().equals(APRAZO)) {
            desconto = pedido.getTotal() * 0.20;
        }
        if (pedido.getFormaDePagamento().equals(CARTAO)) {
            desconto = pedido.getTotal() * 0.05;
        }
        // if(...)
        return desconto;


    }
}