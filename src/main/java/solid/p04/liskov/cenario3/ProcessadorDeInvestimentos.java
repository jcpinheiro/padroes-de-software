package solid.p04.liskov.cenario3;

import java.util.List;

public class ProcessadorDeInvestimentos {

    public static void main(String[] args) {

        for (Conta conta : contasDoBanco() ) {
                conta.somaInvestimento();

            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }

    private static List<Conta> contasDoBanco() {
    	
        return List.of(umaContaCom(100),
                       umaContaCom(150),
                       contaUniversitaria(200) );
    }

    private static Conta contaUniversitaria(double valor) {
        ContaUniversitaria c = new ContaUniversitaria();
        c.deposita(valor);
        return c;
    }

    private static Conta umaContaCom(double valor) {
        Conta c = new Conta();
        c.deposita(valor);
        return c;
    }

}

