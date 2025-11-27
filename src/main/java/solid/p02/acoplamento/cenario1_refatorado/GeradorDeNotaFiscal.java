package solid.p02.acoplamento.cenario1_refatorado;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.IterableResult;

import java.util.List;

public class GeradorDeNotaFiscal {

    private final Iterable<AcaoAposGerarNota> acoesAposGerarNota;

    public GeradorDeNotaFiscal(Iterable<AcaoAposGerarNota> acoes ) {
        this.acoesAposGerarNota = acoes;
    }


    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();
        NotaFiscal notaFiscal = new NotaFiscal(valor, impostoSimplesSobreO(valor) );

        acoesAposGerarNota.forEach(acaoAposGerarNota -> acaoAposGerarNota.executa(notaFiscal) );

        return notaFiscal;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}
