package padroes.p04.builder.cenario01;

//Builder
public abstract class SanduicheBuilder {
	public abstract void abrePao();
	public abstract void insereIngredientes();
	public abstract void fechaPao();
	public abstract Sanduiche getSanduiche(); 
}