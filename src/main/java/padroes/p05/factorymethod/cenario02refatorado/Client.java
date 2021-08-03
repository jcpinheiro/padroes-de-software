package padroes.p05.factorymethod.cenario02refatorado;

import padroes.p05.factorymethod.cenario02refatorado.database.DataBase;
import padroes.p05.factorymethod.cenario02refatorado.factory.OracleFactory;

public class Client {

	public static void main(String[] args) {
//		DB db = new PostgresFactory().getDatabase();
		DataBase db = new OracleFactory().getDatabase();
		db.query("SELECT * FROM users");
		db.update("INSERT INTO users VALUES ('User', 25)");
	}
}
