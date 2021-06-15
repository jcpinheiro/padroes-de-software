package padroes.p01.strategy.cenario01_refatorado;

public class Item {

    private Produto produto;
    private int quatidade;

    public Item(Produto produto, int quatidade ) {
        this.produto = produto;
        this.quatidade = quatidade;
    }

    public double getSubTotal() {
        return this.produto.getValor() * quatidade;
    }

    // ...
}
