package solid.p01.coesao_SRP.cenario1.parte3;

import java.util.HashMap;
import java.util.Objects;

import static java.util.Objects.nonNull;

public class GerenciadorDeDividas {

    private HashMap<String, Divida> dividas = new HashMap<String, Divida>();

    public void registraDivida(String credor, String cnpjCredor, double total) {

        Divida divida = new Divida(total);
        divida.setCredor(credor);
        divida.setCnpjCredor(cnpjCredor);
        dividas.put(cnpjCredor, divida);
    }

    public void pagaDivida(String cnpjCredor, Pagamento pagamento) {

        Divida divida = dividas.get(cnpjCredor);

        if (nonNull(divida)) {
            //divida.getPagamentos().add(pagamento);
            //divida.paga(pagamento.getValor());

            divida.registra(pagamento);


        } else {
            throw new IllegalArgumentException("O CNPJ é inválido: " + cnpjCredor);
        }
    }
}