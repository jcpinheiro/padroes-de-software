package solid.p04.liskov.cenario3;

public class Conta {

    protected double saldo;

    public Conta() {
        this.saldo = 0;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            throw new IllegalArgumentException("Saldo Insuficiente");
        }
    }

    public void somaInvestimento(){
        this.saldo += this.saldo * 0.01;
    }

    public double getSaldo() {
        return saldo;
    }

}