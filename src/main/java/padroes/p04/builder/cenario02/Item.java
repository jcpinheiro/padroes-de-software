package padroes.p04.builder.cenario02;

public class Item {
    private double valor;
    private String nome;

    public Item(String nome, double valor) {
        this.valor = valor;
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Item{" +
                "valor=" + valor +
                ", nome='" + nome + '\'' +
                '}';
    }
}
