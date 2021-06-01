package padroes.p01.cenario02.strategy;

public class ISS  {

 public double calcula(Orcamento orcamento) {
      // verificar a regra para cada município
      return orcamento.getValor() * 0.06;
  }
 
}
