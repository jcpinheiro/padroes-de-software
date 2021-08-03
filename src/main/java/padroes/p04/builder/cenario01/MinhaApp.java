package padroes.p04.builder.cenario01;

public class MinhaApp {

	public static void main(String[] args) {
		// Diretor
		Cozinha cozinha = new Cozinha();
		
		//Builders
		SanduicheBuilder b1 = new HamburguerBuilder();
		SanduicheBuilder b2 = new FishBuilder();

		// Diretor delega ao builder escolhido para construção do produto
		cozinha.fazSanduiche(b1);
		b1.getSanduiche();
	}

}
