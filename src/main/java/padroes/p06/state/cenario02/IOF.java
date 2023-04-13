package padroes.p06.state.cenario02;

public class IOF implements Imposto {
    private static final double TAXA = 0.038;

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * TAXA;
    }
}
