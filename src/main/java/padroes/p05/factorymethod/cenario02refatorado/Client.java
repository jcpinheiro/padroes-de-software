package padroes.p05.factorymethod.cenario02refatorado;

import padroes.p05.factorymethod.cenario02refatorado.database.DataBase;
import padroes.p05.factorymethod.cenario02refatorado.database.PostgresDB;
import padroes.p05.factorymethod.cenario02refatorado.factory.OracleFactory;
import padroes.p05.factorymethod.cenario02refatorado.factory.PostgresFactory;

public class Client {

	public static void main(String[] args) {
//		DataBase db = new PostgresFactory().getDatabase();
		DataBase db = new OracleFactory().getDatabase();

		db.query("SELECT * FROM users");
		db.update("INSERT INTO users VALUES ('User', 25)");
	}
}
