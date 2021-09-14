package padroes.p10.composite.cenario01;

import java.util.ArrayList;
import java.util.List;


//Composite
public class Gerente extends Empregado {
  
    //Collection of child graphics.
    private List<Empregado> listaSubordinados = new ArrayList<Empregado>();
  
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
     
    //Exibe a estrutura 
    public void exibeInformacoes() {
        System.out.println(super.nome + ", R$" + super.salario);
        for (Empregado e : listaSubordinados) {
            e.exibeInformacoes();
        }
    }
  
    //Adiciona empregado na estrutura.
    public void supervisiona(Empregado empregado) {
        listaSubordinados.add(empregado);
    }
  
    //Remove empregado da estrutura.
    public void remove(Empregado e) {
        listaSubordinados.remove(e);
    }
}