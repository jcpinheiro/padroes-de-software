package solid.p04.liskov.cenario1;

// Usado para interagir com o back-end da aplicação
public class UIController {
	
	private DataRepository dataRepository;
	
	public void persist(Object object) {
		
		if (!(dataRepository instanceof HistoricStockPriceRepository )) {
			dataRepository.persist(object);
		}
	}
	
	public void retrieve(long id) {

		dataRepository.read(id);
	}

	public void setDataRepository(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}
}
