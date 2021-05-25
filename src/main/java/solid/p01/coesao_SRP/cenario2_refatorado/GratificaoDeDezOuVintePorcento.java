package solid.p01.coesao_SRP.cenario2_refatorado;

public class GratificaoDeDezOuVintePorcento implements Gratificacao {

    @Override
    public double calcula(Funcionario funcionario) {

        if(funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.20;
        }
        else {
            return funcionario.getSalarioBase() * 0.10;
        }    }
}
