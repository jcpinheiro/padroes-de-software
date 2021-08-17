package padroes.p07.abstractfactory.cenario01;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class MinhaApp {

	public static void main(String[] args) {
		//Empresas de ônibus
		EmpresaOnibus viacaoXYZ = new ConcreteEmpresaOnibus();
		
		//Emite passagens
		PassagemOnibusUrbano pUrbano =
				viacaoXYZ
						.emitePassagemOnibusUrbano("São Paulo", "Campinas", new GregorianCalendar(2016, Calendar.MARCH, 10, 11, 0));
		
		PassagemOnibusInterestadual pInterestadual =
				viacaoXYZ.emitePassagemOnibusInterestadual("São Paulo", "Rio de Janeiro", new GregorianCalendar(2016, Calendar.APRIL, 20, 8, 30));
		
		//Exibe detalhes da passagem
		pUrbano.exibeDetalhes();
		pInterestadual.exibeDetalhes();
	}

}
