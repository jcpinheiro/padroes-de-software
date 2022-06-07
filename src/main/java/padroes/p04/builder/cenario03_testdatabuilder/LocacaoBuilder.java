package padroes.p04.builder.cenario03_testdatabuilder;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class LocacaoBuilder {

	private Locacao locacao;

	private LocacaoBuilder() { }

	public static LocacaoBuilder umaLocacao() {
		LocacaoBuilder builder = new LocacaoBuilder();
		
		builder.locacao = new Locacao();
		builder.locacao.setUsuario(UsuarioBuilder.umUsuario().constroi() );
		builder.locacao.setFilmes(List.of(FilmeBuilder.umFilme().constroi() ) );
		builder.locacao.setDataLocacao(LocalDate.now() );
		builder.locacao.setDataPrevista(LocalDate.now().plusDays(1) );
		
		builder.locacao.setValor(4.0);

		return builder;
	}

	
	public LocacaoBuilder paraUsuario(Usuario usuario) {
		locacao.setUsuario(usuario);
		return this;
	}

	public LocacaoBuilder comListaFilmes(Filme... filme) {
		locacao.setFilmes(Arrays.asList(filme) );
		return this;
	}

	public LocacaoBuilder comDataLocacao(LocalDate dataLocacao) {
		locacao.setDataLocacao(dataLocacao);
		locacao.setDataDevolucao(dataLocacao.plusDays(1));
		return this;
	}

	public LocacaoBuilder comDataRetorno(LocalDate dataRetorno) {
		locacao.setDataPrevista(dataRetorno);
		return this;
	}
	
	public LocacaoBuilder emAtraso() {
		locacao.setDataLocacao(LocalDate.now().minusDays(5) );
		locacao.setDataPrevista(LocalDate.now().minusDays(6) );
		return this;
	}
	

	public LocacaoBuilder comValor(double valor) {
		locacao.setValor(valor);
		return this;
	}

	public LocacaoBuilder jaFinalizada() {
		locacao.setDataLocacao(LocalDate.now().minusDays(5) );
		locacao.setDataPrevista(LocalDate.now().minusDays(4) );
		locacao.setDataDevolucao(LocalDate.now().minusDays(4) );

		return this;
	}


	public Locacao constroi() {
		return locacao;
	}



}
