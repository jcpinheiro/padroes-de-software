package padroes.p03.templatemethod.cenario02;

public abstract class RelatorioFaturamentoMensal {

    private void carregarDadosFaturamento() {
        // Obtém dados relativos ao faturamento num
        // determinado mês
    }

    private void processarInformacoes() {
        // Gera as informações do relatório
        // a partir do processamento
        // ...
    }

    protected abstract void criarArquivoRelatorio();

    // template method
    public final void gerarRelatorio() {
        // Este método centraliza o processo das diversas
        // atividades envolvidas na geração de um relatório
        carregarDadosFaturamento();
        processarInformacoes();
        criarArquivoRelatorio();
    }
}