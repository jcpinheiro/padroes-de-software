package padroes.p05.factorymethod.cenario02refatorado.database;

public class PostgresDB implements DataBase {

	public void query(String sql) {
		System.out.println("Querying " + sql + " in Postgres database");
	}
	
	public void update(String sql) {
		System.out.println("Uptade querry " + sql + " in Postgres database");
	}
}
