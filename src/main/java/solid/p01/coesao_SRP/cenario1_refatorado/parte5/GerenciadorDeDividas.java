package solid.p01.coesao_SRP.cenario1_refatorado.parte5;

import solid.p01.coesao_SRP.cenario1_refatorado.parte3.Divida;
import solid.p01.coesao_SRP.cenario1_refatorado.parte3.Pagamento;

import java.util.HashMap;
import java.util.Map;

public final class GerenciadorDeDividas {

    private final Map<String, solid.p01.coesao_SRP.cenario1_refatorado.parte3.Divida> dividas = new HashMap<>();

    public void registraDivida(solid.p01.coesao_SRP.cenario1_refatorado.parte3.Divida divida) {
        dividas.put(divida.getCnpjCredor(), divida);
    }

    public void pagaDivida(Cnpj cnpjCredor, Pagamento pagamento) {

        Divida divida = dividas.get(cnpjCredor);

        if (divida != null) {
            divida.registra(pagamento);
        }


    }

}
