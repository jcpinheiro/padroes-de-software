package padroes.p09.observer.cenario01;

public class AniversarioSurpresa {

    public static void main(String[] args) {
        Namorada namorada = new Namorada();
        // Convidados ..

        Porteiro porteiro = new Porteiro();

        porteiro.adicionaObservador(namorada );

        porteiro.start();

    }
}
