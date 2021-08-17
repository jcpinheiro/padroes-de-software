package padroes.p06.state.cenario02;

import java.util.List;

public class Orcamento {

    private double valor;
    private final List<Item> itens = List.of();

    public static final int EM_APROVACAO = 1;
    public static final int APROVADO = 2;
    public static final int REPROVADO = 3;
    public static final int FINALIZADO = 4;


    private int estadoAtual;

    public double getValor() {
        return valor;
    }

    public void aplicaDescontoExtra() {
        if(estadoAtual == EM_APROVACAO) valor = valor - (valor * 0.05);
        else if (estadoAtual == APROVADO) valor = valor - (valor * 0.02);
        else throw new RuntimeException("Somente orcamento em aprovação ou aprovados recebem desconto extra!");
    }

    public void aprova() {
        // ...
    }
}