package padroes.p16.singleton.cenario01;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // código de inicialização da instância
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}