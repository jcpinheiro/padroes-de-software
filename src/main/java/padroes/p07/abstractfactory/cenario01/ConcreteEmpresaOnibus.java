package padroes.p07.abstractfactory.cenario01;

import java.util.Calendar;

public class ConcreteEmpresaOnibus extends EmpresaOnibus {

	public PassagemOnibusUrbano emitePassagemOnibusUrbano(String origem, String destino, Calendar dataHoraPartida) {

		return new ConcretePassagemOnibusUrbano(origem, destino, dataHoraPartida);
	}

	public PassagemOnibusInterestadual emitePassagemOnibusInterestadual(String origem, String destino, Calendar dataHoraPartida) {

		return new ConcretePassagemOnibusInterestadual(origem, destino, dataHoraPartida);
	}

	
	
}
