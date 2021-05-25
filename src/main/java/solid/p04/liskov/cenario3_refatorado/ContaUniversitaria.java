package solid.p04.liskov.cenario3_refatorado;

public class ContaUniversitaria  {

    private int milhas;
    private MovimentacaoConta movimentacaoConta = new MovimentacaoConta();


    public void deposita(double valor) {

        movimentacaoConta.deposita(valor );
        this.milhas += (int) valor;
    }

    public void saca(double valor) {
        movimentacaoConta.saca(valor);
    }

    public int getMilhas() {
        return milhas;
    }
    

}

