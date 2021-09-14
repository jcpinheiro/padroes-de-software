package padroes.p10.composite.cenario01;

//Leaf
public class Programador extends Empregado {
  
    public Programador(String nome, double salario) {
        super(nome, salario);
    }
 
    //Exibe detalhes do empregado
    public void exibeInformacoes() {
        System.out.println(super.nome + ",\t R$" + super.salario);
    }
     
    //Adiciona empregado na estrutura.
    void supervisiona(Empregado e) {
        throw new IllegalCallerException("Não é possível adicionar empregado subordinado do programador");
    }
  
    //Remove empregado da estrutura.
    public void remove(Empregado e) {
        throw new IllegalCallerException("Não é possível remover empregado subordinado do programador");
    }
}