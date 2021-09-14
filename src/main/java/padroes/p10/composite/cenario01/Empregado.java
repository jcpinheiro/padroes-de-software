package padroes.p10.composite.cenario01;

//Component
public abstract class Empregado {
         
    protected String nome;
    protected double salario;
     
    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
 
    //Exibe detalhes do empregado
    public abstract void exibeInformacoes();
     
    abstract void supervisiona(Empregado e);
    public abstract void remove(Empregado e);
}