package padroes.p10.composite.cenario02;

import java.util.ArrayList;
import java.util.List;
 
public class Congresso {
 
    private String nome;
 
    private int totalAssentos;
 
    private List<Participante> participantes;
 
    public Congresso(String nome, int totalAssentos) {
        this.nome = nome;
        this.totalAssentos = totalAssentos;
        participantes = new ArrayList<>();
    }
 
    public String getNome() {
        return nome;
    }
 
    public int getTotalAssentos() {
        return totalAssentos;
    }
 
    public int getTotalParticipantes() {
        int totalParticipantes = 0;
 
        for (Participante participante : participantes) {
        if (participante instanceof Individuo) {
          totalParticipantes++;
        } else if (participante instanceof Instituicao) {
          Instituicao instituicao = (Instituicao) participante;
          totalParticipantes += instituicao.getMembros().size();
        }
        }
 
        return totalParticipantes;
    }
 
    public void adicionarParticipante(Participante participante) {
 
       if (participante instanceof Individuo) {
 
        if (totalAssentos > participantes.size()) {
          participantes.add(participante);
        } else {
          throw new UnsupportedOperationException("Congresso não possui assentos livres!");
        }
 
         } else if (participante instanceof Instituicao) {
 
        Instituicao t = (Instituicao) participante;
 
           if (totalAssentos > participantes.size() + t.getMembros().size()) {
                participantes.add(participante);
        } else {
        throw new UnsupportedOperationException("Congresso não possui"                               + " quantidade de assentos livres que Instituição necessita!");            }
      }
    }
 
    public void imprimeParticipantes() {
      System.out.println("----- Listagem de Participantes -----");
      for (Participante participante : participantes) {
        if (participante instanceof Individuo) {
         System.out.println(participante + " - Instituição: Sem Filiação");
        } else if (participante instanceof Instituicao) {
         Instituicao instituicao = (Instituicao) participante;
         instituicao.imprimeMembros();
        }
      }
    }
 
    @Override
    public String toString() {
       return this.nome + " - Assentos: " + this.totalAssentos
        + " - Participantes: " + getTotalParticipantes();
    }
 
    public static void main(String[] args) {
    Congresso congresso = new Congresso("Congresso Nacional", 5);
      Participante bruno = new Individuo("Bruno Garcia", 1);
      Participante sarney = new Individuo("José Sarney", 2);
 
      congresso.adicionarParticipante(bruno);
      congresso.adicionarParticipante(sarney);
 
      Participante eduardo = new Individuo("Eduardo Suplicy", 3);
      Participante mercadante = new Individuo("Aloisio Mercadante", 4);
 
      Participante partidoTrabalhadores = new Instituicao("PT");
      partidoTrabalhadores.adicionar(eduardo);
      partidoTrabalhadores.adicionar(mercadante);
 
      congresso.adicionarParticipante(partidoTrabalhadores);
 
      System.out.println(congresso);
      congresso.imprimeParticipantes();
    }
}