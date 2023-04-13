package padroes.p06.state.cenario02;

public class Orcamento {

    public static final int EM_APROVACAO = 1;
    public static final int APROVADO = 2;
    public static final int REPROVADO = 3;
    public static final int FINALIZADO = 4;

    private int estadoAtual = EM_APROVACAO;

    private double valor;

    public Orcamento(double valor) {
        this.valor = valor;
    }

    public void aplicaDescontoExtra() {

        if(estadoAtual == EM_APROVACAO)
            valor = valor - (valor * 0.02);

        else if(estadoAtual == APROVADO)
            valor = valor - (valor * 0.05);

        else
            throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
    }
    public double getValor() {
        return valor;
    }


    public void aprova() {
        switch (estadoAtual ) {
            case EM_APROVACAO -> this.estadoAtual = APROVADO;
            case APROVADO -> throw new IllegalStateException("Orçamento já foi aprovado anteriormente");
            case REPROVADO -> throw new IllegalStateException("Orçamento Reprovado não pode ser aprovado");
            case FINALIZADO -> throw new IllegalStateException("Orçamento finalizado não pode ser aprovado novamente");
        }
    }

    public void reprova() {
        switch (estadoAtual ) {
            case EM_APROVACAO -> this.estadoAtual = REPROVADO;
            case APROVADO -> throw new IllegalStateException("Orçamento aprovado não pode mais ser reprovado");
            case REPROVADO -> throw new IllegalStateException("Orçamento já foi reprovado anteriormente");
            case FINALIZADO -> throw new IllegalStateException("Orçamento finalizado não pode ser reprovado");
        }
    }

    public void finaliza() {
        switch (estadoAtual ) {
            case EM_APROVACAO -> throw new IllegalStateException("Orçamento Em Aprovação não pode ser finalizado");
            case APROVADO -> this.estadoAtual = FINALIZADO;
            case REPROVADO -> this.estadoAtual = FINALIZADO;
            case FINALIZADO -> throw new IllegalStateException("Orçamento já foi finalizado anteriormente");
        }
    }
}
