package solid.p04.liskov.cenario1;

public class HistoricStockPriceRepository implements DataRepository {

	@Override
	public void persist(Object objeto) {
		throw new IllegalStateException("Suporta apenas operações de leitura");
		
	}

	@Override
	public Object read(long id) {
		//TODO Lê do banco de dados
		return null;
	}

}
