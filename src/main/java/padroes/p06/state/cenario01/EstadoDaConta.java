package padroes.p06.state.cenario01;

interface EstadoDaConta {
      void saca(Conta conta, double valor);
      void deposita(Conta conta, double valor);
    }