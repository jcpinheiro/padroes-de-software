package padroes.p01.strategy.cenario02;

public class ISS  {

 public double calcula(Orcamento orcamento) {
      // verificar a regra para cada município
      return orcamento.getValor() * 0.06;
  }
 
}
