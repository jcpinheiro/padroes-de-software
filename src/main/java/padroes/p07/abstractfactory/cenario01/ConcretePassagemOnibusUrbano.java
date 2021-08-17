package padroes.p07.abstractfactory.cenario01;

import java.util.Calendar;

public class ConcretePassagemOnibusUrbano extends PassagemOnibusUrbano {

	public ConcretePassagemOnibusUrbano(String origem, String destino, Calendar dataHoraPartida) {
		
		super(origem, destino, dataHoraPartida);
	}

	public void exibeDetalhes() {
		System.out.println("Passagem de �nibus urbana: " + this.getOrigem() + 
				" para " + this.getDestino() + 
				", Data/Hora: " + super.df.format(this.getDataHoraPartida().getTime()));
	}

}
