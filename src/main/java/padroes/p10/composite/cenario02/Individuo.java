package padroes.p10.composite.cenario02;

public class Individuo extends Participante {
 
    private String nome;
 
    private int assento;
 
    public Individuo(String nome, int assento) {
        this.nome = nome;
        this.assento = assento;
    }
 
    @Override
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    @Override
    public int getAssento() {
        return assento;
    }
 
    public void setAssento(int assento) {
        this.assento = assento;
    }
 
    @Override
    public String toString() {
        return "Nome: " + this.nome + " - Assento: " + this.assento;
    }
}