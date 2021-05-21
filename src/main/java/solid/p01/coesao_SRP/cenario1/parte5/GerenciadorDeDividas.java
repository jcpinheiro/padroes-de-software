package solid.p01.coesao_SRP.cenario1.parte5;

import solid.p01.coesao_SRP.cenario1.parte3.Divida;
import solid.p01.coesao_SRP.cenario1.parte3.Pagamento;

import java.util.HashMap;

public final class GerenciadorDeDividas {

    private final HashMap<String, Divida> dividas = new HashMap<>();

    public void registraDivida(Divida divida) {
        dividas.put(divida.getCnpjCredor(), divida);
    }

    public void pagaDivida(Cnpj cnpjCredor, Pagamento pagamento) {

        Divida divida = dividas.get(cnpjCredor);

        if (divida != null) {
            divida.registra(pagamento);
        }


    }

}
