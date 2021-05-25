package solid.p04.liskov.cenario1;

import java.util.ArrayList;
import java.util.List;

public class TestePagamentos {

    public static void main(String[] args) {

        Pagamento p1 = new Pagamento();
        p1.setValor(105);

        Pagamento p2 = new Pagamento();
        p2.setValor(25);

        ListaDePagamentos pagamentos1 = new ListaDePagamentos();
        pagamentos1.registra(p1 );
        pagamentos1.registra(p2 );

        System.out.println("Valor já pago: " + pagamentos1.getValorPago());

        // 122.0
        ListaDePagamentos pagamentos2 = new ListaDePagamentos();

        List<Pagamento> adicionar = new ArrayList<Pagamento>();
        adicionar.add(p1);
        adicionar.add(p2);

        pagamentos2.addAll(adicionar );

        System.out.println("Valor já pago: " + pagamentos2.getValorPago());
// 0.0
    }
}
