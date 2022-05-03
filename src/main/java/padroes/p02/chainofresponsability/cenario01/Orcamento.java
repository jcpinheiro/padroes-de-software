package padroes.p02.chainofresponsability.cenario01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    private double valor;
    List<Item> itens;

    public Orcamento(double valor) {
        this.valor = valor;
        itens = new ArrayList<>();
    }

    public void adiciona(Item item) {
        itens.add(item );
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens );
    }

    public double getValor() {
        return valor;
    }
}
