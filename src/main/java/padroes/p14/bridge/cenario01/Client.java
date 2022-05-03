package padroes.p14.bridge.cenario01;

import padroes.p14.bridge.cenario01.converters.CSVConverter;
import padroes.p14.bridge.cenario01.converters.Converter;
import padroes.p14.bridge.cenario01.converters.JsonConverter;
import padroes.p14.bridge.cenario01.employees.DBA;
import padroes.p14.bridge.cenario01.employees.ProjectManager;

public class Client {

	public static void main(String[] args) {
		Converter csvConverter = new CSVConverter();
		Converter jsonConverter = new JsonConverter();

		DBA it = new DBA("Maurice Moss", 32, 4000d);
		ProjectManager pm = new ProjectManager("Jen Barber", 40, 6000d);
		
		System.out.println(csvConverter.getEmployeeFormated(it) );
		System.out.println(jsonConverter.getEmployeeFormated(it) );
		System.out.println(jsonConverter.getEmployeeFormated(pm) );
		System.out.println(jsonConverter.getEmployeeFormated(pm) );
	}
}
