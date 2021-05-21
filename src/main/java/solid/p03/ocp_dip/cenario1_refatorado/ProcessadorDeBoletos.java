package solid.p03.ocp_dip.cenario1_refatorado;

import java.util.List;

public class ProcessadorDeBoletos {

    public void processa(List<Boleto> boletos, Fatura fatura) {

        double total = 0;

        for(Boleto boleto : boletos) {

            Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
            fatura.realiza(pagamento );

            total += fatura.getValor();
        }

        fatura.requisitaFinalizacao(total );

    }
}
