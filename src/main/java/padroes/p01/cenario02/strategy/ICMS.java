package padroes.p01.cenario02.strategy;

public class ICMS {
 
  public double calcula(Orcamento orcamento) {

      // implementar a regra para pegar a aliquata de cada estado
      // if-else-if...
      return orcamento.getValor() * 0.10;
  }
}
