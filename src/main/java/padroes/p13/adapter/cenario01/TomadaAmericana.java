package padroes.p13.adapter.cenario01;

public class TomadaAmericana extends Tomada<PlugAmericano> {

	public String conecta(PlugAmericano plug) {
		return plug.obtemEletricidade() + this.getNomeRede();
	}
	
	public String getNomeRede() {
		return "tomada americana";
	}
}
