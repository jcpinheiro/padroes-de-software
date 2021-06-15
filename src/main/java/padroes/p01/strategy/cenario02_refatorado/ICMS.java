package padroes.p01.strategy.cenario02_refatorado;

public class ICMS implements Imposto {
 
  @Override
  public double calcula(Orcamento orcamento) {
      return orcamento.getValor() * 0.10;
  }
}
