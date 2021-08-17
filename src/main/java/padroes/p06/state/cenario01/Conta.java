package padroes.p06.state.cenario01;

class Conta {
    protected double saldo;
    protected EstadoDaConta estado;

    public Conta() {
        estado = new ContaPositiva();
    }

    public void saca(double valor) {
        estado.saca(this, valor);
    }

    public void deposita(double valor) {
        estado.deposita(this, valor);
    }
}