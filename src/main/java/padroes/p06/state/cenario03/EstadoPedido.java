package padroes.p06.state.cenario03;

enum EstadoPedido {
    ORCAMENTO {
        @Override
        public EstadoPedido finaliza() {
            return EstadoPedido.FINALIZADO;
        }

        @Override
        public EstadoPedido cancela() {
            return EstadoPedido.CANCELADO;
        }
    },
    FINALIZADO {
        @Override
        public EstadoPedido finaliza() {
            throw new IllegalStateException("Pedido já foi Finalizado");
        }

        @Override
        public EstadoPedido cancela() {
            throw new IllegalStateException("Pedido finalizado Não pode ser cancelado");
        }
    },
    CANCELADO {
        @Override
        public EstadoPedido finaliza() {
            throw new IllegalStateException("Pedido Cancelado não pode ser finalizado");
        }

        @Override
        public EstadoPedido cancela() {
            throw new IllegalStateException("Pedido já foi cancelado");
        }
    };
    public abstract EstadoPedido finaliza();
    public abstract EstadoPedido cancela();
}