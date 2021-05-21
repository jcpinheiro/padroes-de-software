package solid.p04.liskov.cenario2;

public class ContaUniversitaria extends ContaComum {

    private int milhas;

    public void deposita(double valor) {
        super.deposita(valor);
        this.milhas += (int)valor;
    }

    public int getMilhas() {
        return milhas;
    }
    
    @Override
    public void somaInvestimento() {
        throw new RuntimeException("Não pode ter investimento!!");
    }
}

