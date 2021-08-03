package padroes.p04.builder.cenario02_refatorado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscalBuilder {


    private String razaoSocial;
    private String cnpj;
    private LocalDate dataDeEmissao;
    private double valorBruto;
    private double impostos;
    public List<Item> itens;
    public String observacoes;

    public NotaFiscalBuilder() {
        this.itens = new ArrayList<>();
    }

    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj ) {
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder comItem(Item item ) {
        itens.add(item );
        return this;
    }

    public NotaFiscalBuilder comObservacoes(String observacoes ) {
        this.observacoes = observacoes;
        return this;
    }

    public NotaFiscalBuilder naDataAtual() {
        this.dataDeEmissao = LocalDate.now();
        return this;
    }

    public NotaFiscal constroi() {
        double valorBruto = itens.stream()
                                 .mapToDouble(Item::getValor)
                                 .sum();
        impostos = valorBruto * 0.05;
        return new
                NotaFiscal(razaoSocial, cnpj, dataDeEmissao,
                           valorBruto, impostos, itens,
                           observacoes);
    }
}
