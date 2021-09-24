package padroes.p13.adapter.cenario01;

//Target
public abstract class Tomada<P> {

	public abstract String conecta(P plug);
	
	public abstract String getNomeRede();
}
