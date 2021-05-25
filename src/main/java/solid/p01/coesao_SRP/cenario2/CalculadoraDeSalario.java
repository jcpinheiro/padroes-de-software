package solid.p01.coesao_SRP.cenario2;

public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario) {
       
    	if(Cargo.DESENVOLVEDOR.equals(funcionario.getCargo())) {
            return gratificaDezOuVintePorcento(funcionario);
        }

        if(Cargo.DBA.equals(funcionario.getCargo()) || Cargo.ANALISTA.equals(funcionario.getCargo())) {
            return gratificaQuinzeOuVinteCincoPorcento(funcionario);
        }

        throw new RuntimeException("funcionario invalido");
    }

    private double gratificaDezOuVintePorcento(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.20;
        }
        else {
            return funcionario.getSalarioBase() * 0.10;
        }
    }

    private double gratificaQuinzeOuVinteCincoPorcento(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.25;
        }
        else {
            return funcionario.getSalarioBase() * 0.15;
        }
    }
    
    private double outraRegra(Funcionario funcionario) {
    	return 0;
    }

}

