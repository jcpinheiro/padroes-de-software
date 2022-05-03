package padroes.p01.strategy.cenario02;

public class CalculadorDeImpostos {

    public void calcula(Orcamento orcamento, String imposto) {

        if( "ICMS".equalsIgnoreCase(imposto) ) {
            double icms = new ICMS().calcula(orcamento );
            System.out.println(icms);

        } else if( "ISS".equals(imposto) ) {
            double iss = new ISS().calcula(orcamento );
            System.out.println(iss);
        } else if (false) {
            // PIS COFINS, ...
        } else {
            //...
            throw new IllegalArgumentException("Imposto inválido!!" );
        }

    }
}
