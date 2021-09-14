package padroes.p09.observer.cenario04;

public class Corretora implements AcaoObserver {
    private String nome;

    public Corretora(String nome) {
        this.nome = nome;
    }

    public void notificaAlteracao(Acao acao) {
        System.out.println(" Corretora " + this.nome + " sendo notificada :");
        System.out.println("A ação " + acao.getCodigo()
                + " teve o seu valor alterado para " + acao.getValor());
    }
}