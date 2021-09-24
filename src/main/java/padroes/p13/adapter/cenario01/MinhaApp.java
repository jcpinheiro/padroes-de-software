package padroes.p13.adapter.cenario01;

public class MinhaApp {

	public static void main(String[] args) {
		//Target
		TomadaBrasileira tomadaBras = new TomadaBrasileira();
		
		//Adaptado
		PlugAmericano plugEUA = new PlugAmericano();

		AdapterEUAtoBrasil tomadaModificada = new AdapterEUAtoBrasil();
		String s = tomadaModificada.conecta(plugEUA);
		
		System.out.println(s);
		
	}

}
