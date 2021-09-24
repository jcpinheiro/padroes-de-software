package padroes.p13.adapter.cenario01;

//Adapter
public class AdapterEUAtoBrasil extends TomadaBrasileira {
	
	public String conecta(PlugAmericano plug) {
		return plug.obtemEletricidade() + this.getNomeRede();
	}
}
