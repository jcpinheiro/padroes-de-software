package padroes.p07.abstractfactory.cenario01;

import java.util.Calendar;

public abstract class EmpresaOnibus {
	
	public abstract PassagemOnibusUrbano emitePassagemOnibusUrbano(String origem,
																   String destino,
																   Calendar dataHoraPartida);
	
	public abstract PassagemOnibusInterestadual emitePassagemOnibusInterestadual(String origem,
																				 String destino,
																				 Calendar dataHoraPartida);
	
}
