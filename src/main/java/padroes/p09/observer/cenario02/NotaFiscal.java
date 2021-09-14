package padroes.p09.observer.cenario02;

import java.util.Calendar;
import java.util.List;
  public class NotaFiscal {
 
    private String razaoSocial;
    private String cnpj;
    private Calendar dataDeEmissao;
    private double valorBruto;
    private double impostos;
    public List<ItemDaNota> itens;
    public String observacoes;
     
    public NotaFiscal(String razaoSocial, String cnpj, Calendar 
                                                     dataDeEmissao,
            double valorBruto, double impostos, List<ItemDaNota> itens,
            String observacoes) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dataDeEmissao = dataDeEmissao;
        this.valorBruto = valorBruto;
        this.impostos = impostos;
        this.itens = itens;
        this.observacoes = observacoes;
    }
 
    // getters
 }
