package padroes.p09.observer.cenario04;


import java.util.HashSet;
import java.util.Set;

public class Acao {
    private String codigo;
    private double valor;
    private Set<AcaoObserver> interessados = new HashSet<>();

    public Acao(String codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public void registraInteressado(AcaoObserver interessado) {
        this.interessados.add(interessado);
    }

    public void cancelaInteresse(AcaoObserver interessado) {
        this.interessados.remove(interessado);
    }

    public double getValor() {
        return valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setValor(double valor) {
        this.valor = valor;
        for (AcaoObserver interessado : this.interessados) {
            interessado.notificaAlteracao(this);
        }
    }
}

/*public class Acao {
    private final String codigo;
    private double valor;

    public Acao(String codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }
}*/
