package solid.p01.coesao_SRP.cenario2_refatorado;

public class GratificaoDeQuinzeOuVinteCincoPorcento implements Gratificacao {

    @Override
    public double calcula(Funcionario funcionario) {

        if (funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.75;
        } else {
            return funcionario.getSalarioBase() * 0.85;
        }
    }
}
