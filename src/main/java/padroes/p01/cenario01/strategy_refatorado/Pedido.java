package padroes.p01.cenario01.strategy_refatorado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pedido {
    private FormaPagamento formaDePagamento;
    private Cliente cliente;
    private List<Item> itens = new ArrayList<>();

    private  DescontoStrategy strategy;

    public double getTotal() {
        return  itens
                .stream()
                .mapToDouble(item-> item.getSubTotal() )
                .sum();
    }

    public double getTotalComDesconto() {
        return this.getTotal() - strategy.calculaDesconto(this);
    }

    public void setStrategy(DescontoStrategy st) {
        strategy = st;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public FormaPagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaPagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public void adiciona(Item ...itens) {
        Arrays.stream(itens).forEach(item -> this.itens.add(item));
    }

//demais getters e setters omitidos
}