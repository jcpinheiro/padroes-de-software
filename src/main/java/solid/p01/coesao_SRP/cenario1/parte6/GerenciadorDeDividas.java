package solid.p01.coesao_SRP.cenario1.parte6;

import java.util.HashMap;
import java.util.Map;

public final class GerenciadorDeDividas {

    private final Map<Documento, Divida> dividas = new HashMap<>();

    public void registraDivida(Divida divida) {
           dividas.put(divida.getDocumentoCredor(), divida);

    }

    public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
        Divida divida = dividas.get(documentoCredor );

        if (divida != null) {
            divida.registra(pagamento );
        } else {
            throw new IllegalArgumentException("Não existe dívida associada ao CNPJ");
        }
    }


}
