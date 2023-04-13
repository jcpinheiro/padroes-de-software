package padroes.p16.singleton.cenario01;

public class AppConfig {
    private static final AppConfig instance = new AppConfig();
    private AppConfig() {
        // código de inicialização da instância
    }
    public static AppConfig getInstance() {
        return instance;
    }
    // outros métodos e atributos da classe
}