package padroes.p02.templatemethod.cenario02;

public abstract class RelatorioFaturamentoMensal
{
    private void CarregarDadosFaturamento()
    {
        // Obtém dados relativos ao faturamento num
        // determinado mês
    }

    private void ProcessarInformacoes()
    {
        // Gera as informações do relatório
        // a partir do processamento
        // ...
    }

    protected abstract void CriarArquivoRelatorio();

    public final void GerarRelatorio()
    {
        // Este método centraliza o processo das diversas
        // atividades envolvidas na geração de um relatório
        CarregarDadosFaturamento();
        ProcessarInformacoes();
        CriarArquivoRelatorio();
    }
}