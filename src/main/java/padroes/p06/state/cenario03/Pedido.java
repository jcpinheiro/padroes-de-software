package padroes.p06.state.cenario03;

public class Pedido {

    private int codigo;
    private String descricao;
    private EstadoPedido estadoPedido;

    public Pedido() {
        estadoPedido = EstadoPedido.ORCAMENTO;
    }

    public void finaliza() {
        this.estadoPedido = estadoPedido.finaliza();
    }

    public void cancela() {
        this.estadoPedido = estadoPedido.cancela();
    }

    public String getEstadoPedido() {
        return estadoPedido.name();
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.finaliza();
        System.out.println( pedido.getEstadoPedido() );
    }
}


