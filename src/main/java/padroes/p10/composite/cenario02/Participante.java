package padroes.p10.composite.cenario02;

public abstract class Participante {
 
    public String getNome() {
        throw new UnsupportedOperationException();
    }
 
    public int getAssento() {
        throw new UnsupportedOperationException();
    }
 
    public void adicionar(Participante participante) {
        throw new UnsupportedOperationException();
    }
 
    public void remover(Participante participante) {
        throw new UnsupportedOperationException();
    }
 
    public Participante getFilho(int index) {
        throw new UnsupportedOperationException();
    }
}