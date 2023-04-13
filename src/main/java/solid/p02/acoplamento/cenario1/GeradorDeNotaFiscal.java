package solid.p02.acoplamento.cenario1;
public class GeradorDeNotaFiscal {

    private final EnviadorDeEmail email;
    private final NotaFiscalDao dao;
    private final EnvidadorDeSMS sms;

    public GeradorDeNotaFiscal(EnviadorDeEmail email, NotaFiscalDao dao,
                               EnvidadorDeSMS sms) {
        this.email = email;
        this.dao = dao;
        this.sms = sms;
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor) );

        dao.persiste(nf);
        email.enviaEmail(nf);
        sms.envia(nf);

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}
