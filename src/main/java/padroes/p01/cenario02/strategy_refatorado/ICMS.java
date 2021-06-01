package padroes.p01.cenario02.strategy_refatorado;

public class ICMS implements Imposto {
 
  @Override
  public double calcula(Orcamento orcamento) {
      return orcamento.getValor() * 0.10;
  }
}
