package padroes.p03.templatemethod.cenario01;

class TreinoNoInicioDaTemporada extends Treino {

	void preparoFisico() {
		System.out.println("Preparo Fisico Leve.");
	}

	void jogoTreino() {
		System.out.println("Jogo Treino com Equipe Junior.");
	}

}