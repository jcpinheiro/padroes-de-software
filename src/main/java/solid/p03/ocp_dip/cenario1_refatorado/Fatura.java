package solid.p03.ocp_dip.cenario1_refatorado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fatura {

    private String cliente;
    private double valor;
    private final List<Pagamento> pagamentos;
    private boolean pago;


    public Fatura(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.pagamentos = new ArrayList<Pagamento>();
        this.pago = false;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public List<Pagamento> getPagamentos() {
        return Collections.unmodifiableList(pagamentos );
    }

    public boolean isPago() {
        return pago;
    }

    private void setPago(boolean pago) {
        this.pago = pago;
    }


    public void realiza(Pagamento pagamento) {
        pagamentos.add(pagamento );
    }

    public boolean requisitaFinalizacao(double total) {

        if (total >= this.valor ) {
            this.pago = true;
            return true;
        } else {
            return  false;
        }
    }
}

