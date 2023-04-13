package solid.p01.coesao_SRP.cenario2_refatorado;

public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario) {
       //return  funcionario.getCargo().getGratificao().calcula(funcionario );
       return funcionario.calculaSalarioMaisGratificacao();

    }

    /*
    *     public double calcula(Funcionario funcionario) {

    	if(Cargo.DESENVOLVEDOR.equals(funcionario.getCargo())) {
            return new GratificaoDeDezOuVintePorcento().calcula(funcionario );
        }

        if(Cargo.DBA.equals(funcionario.getCargo()) || Cargo.TESTER.equals(funcionario.getCargo())) {
            return new GratificaoDeQuinzeOuVinteCincoPorcento().calcula(funcionario);
        }

        throw new RuntimeException("funcionario invalido");
    }

    * */

}

