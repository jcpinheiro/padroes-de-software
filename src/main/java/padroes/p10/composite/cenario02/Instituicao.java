package padroes.p10.composite.cenario02;

import java.util.ArrayList;
import java.util.List;

public class Instituicao extends Participante {

    private String nome;

    private List<Participante> membros;

    public Instituicao(String nome) {
        this.nome = nome;
        membros = new ArrayList<Participante>();
    }

    @Override
    public void adicionar(Participante participante) {
        membros.add(participante);
    }

    @Override
    public void remover(Participante participante) {
        membros.remove(participante);
    }

    @Override
    public Participante getFilho(int index) {
        return membros.get(index);
    }

    @Override
    public String getNome() {
        return nome;
    }

    public List getMembros() {
        return membros;
    }

    @Override
    public String toString() {
        return "Instituição: " + this.nome;
    }

    public void imprimeMembros() {
        membros.forEach(membro ->
                System.out.println(membro + " - Instituição: " + this.nome));
    }
}