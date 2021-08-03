package padroes.p05.factorymethod.cenario01;

public class OracleDB {

	public void query(String sql) {
		System.out.println("Querying " + sql + " in Oracle database");
	}
	
	public void update(String sql) {
		System.out.println("Uptade querry " + sql + " in Oracle database");
	}
}
