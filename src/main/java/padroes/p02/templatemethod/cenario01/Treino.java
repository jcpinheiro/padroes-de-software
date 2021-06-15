package padroes.p02.templatemethod.cenario01;

public abstract class Treino {

	// template method
	public final void treinoDiario() {
		// implementações concretos
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}

	abstract void preparoFisico();
	abstract void jogoTreino();

	final void treinoTatico() {
		System.out.println("Treino Tatico");
	}

}