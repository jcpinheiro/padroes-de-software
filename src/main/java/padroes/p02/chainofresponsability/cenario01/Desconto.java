package padroes.p02.chainofresponsability.cenario01;

public interface Desconto {
    double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
