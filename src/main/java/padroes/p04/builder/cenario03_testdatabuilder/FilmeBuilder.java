package padroes.p04.builder.cenario03_testdatabuilder;

public class FilmeBuilder {
	
	private Filme filme;
	
	private FilmeBuilder() { }

	public static FilmeBuilder umFilme() {
		
		FilmeBuilder builder = new FilmeBuilder();
		
		builder.filme = new Filme();
		builder.filme.setEstoque(4);
		builder.filme.setNome("Filme 1");
		builder.filme.setPrecoLocacao(4.0);
		
		return builder;
	}

    public FilmeBuilder semEstoque() {
		this.filme.setEstoque(0);
		return this;
	}
    
    
    public FilmeBuilder comNome(String nome) {
    	this.filme.setNome(nome);
    	return this;
    }
    
	public Filme constroi() {
		return this.filme;
	}


}
