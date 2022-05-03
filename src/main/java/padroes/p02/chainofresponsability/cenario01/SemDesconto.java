package padroes.p02.chainofresponsability.cenario01;

public class SemDesconto implements Desconto {
    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto proximo) {
        throw new IllegalStateException("A regra Sem Desconto não pode ter próximo" );
    }
}
