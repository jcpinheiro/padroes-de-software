package padroes.p06.state.cenario01;

class ContaPositiva implements EstadoDaConta {

    @Override
    public void saca(Conta conta, double valor) {
        conta.saldo -= valor;

        if (conta.saldo < 0)
            conta.estado = new ContaNegativa();

    }
    @Override
    public void deposita(Conta conta, double valor) {
        // valor deve ser positivo
        conta.saldo += valor * 0.98;
    }

}

