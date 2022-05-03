package padroes.p01.strategy.cenario01;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
 
     private FormaPagamento pagamento;
     private Cliente cliente;
     private List<Item> itens = new ArrayList<>();

    public double getTotal() {
        double total = 0;
        //regra que calcula preco total dos itens
        return total;
    }

    public double getTotalComDesconto() {
        if (pagamento.equals(FormaPagamento.APRAZO)) {
            // ...
            return getTotal() - (0.20 * getTotal());
        }
        else if (pagamento.equals(FormaPagamento.CARTAO)) {
            // ...
            return getTotal() - (0.05 * getTotal());
        }
        else if (getTotal() > 500) {
            // ...
            return getTotal() - (0.15 * getTotal());

        } else if (getTotal() > 300) {
            // ...
            return getTotal() - (0.10 * getTotal());
        }

        return getTotal();
    }
}