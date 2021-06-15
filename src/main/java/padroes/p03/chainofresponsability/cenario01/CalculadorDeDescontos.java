package padroes.p03.chainofresponsability.cenario01;

public class CalculadorDeDescontos {

  public double calcula(Orcamento orcamento) {

    Desconto porCincoItens = new DescontoPorCincoItens();
    Desconto porQuinhentosReais = new DescontoPorMaisDeQuinhentosReais();
    SemDesconto semDesconto = new SemDesconto();

    porCincoItens.setProximo(porQuinhentosReais );
    porQuinhentosReais.setProximo(semDesconto );

     return porCincoItens.desconta(orcamento );
  }

}

/* Solução sem o uso do padrão */
/* ****************************
  public class CalculadorDeDescontos {
      public double calcula(Orcamento orcamento) {
        // verifica primeira regra de possível desconto
        if(orcamento.getItens().size() > 5) {
          return orcamento.getValor() * 0.10;
        }

        // verifica segunda regra de possível desconto
        else if(orcamento.getValor() > 500.0) {
          return orcamento.getValor() * 0.07;
        }

        // verifica terceira, quarta, quinta regra de possível desconto ...
        // um monte de ifs daqui pra baixo
      }
    }

**************************** */
