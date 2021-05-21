package solid.p04.liskov.cenario2_refatorado;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {

    public static void main(String[] args) {

        for (ContaComum conta : contasDoBanco() ) {
            conta.somaInvestimento();

            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }

    private static List<ContaComum> contasDoBanco() {
    	
        return Arrays.asList(umaContaCom(100), 
        		             umaContaCom(150)
                             /*, contaUniversitaria(200)*/ );
    }

    private static ContaUniversitaria contaUniversitaria(double valor) {
        ContaUniversitaria c = new ContaUniversitaria();
        c.deposita(valor);
        return c;
    }

    private static ContaComum umaContaCom(double valor) {
        ContaComum c = new ContaComum();
        c.deposita(valor);
        return c;
    }

}

