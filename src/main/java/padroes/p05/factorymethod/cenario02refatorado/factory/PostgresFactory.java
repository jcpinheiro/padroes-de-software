package padroes.p05.factorymethod.cenario02refatorado.factory;

import padroes.p05.factorymethod.cenario02refatorado.database.DataBase;
import padroes.p05.factorymethod.cenario02refatorado.database.PostgresDB;

public class PostgresFactory implements DBFactory {

	@Override
	public DataBase getDatabase() {
		return new PostgresDB();
	}

}
