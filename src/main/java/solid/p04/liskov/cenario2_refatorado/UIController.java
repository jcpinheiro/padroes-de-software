package solid.p04.liskov.cenario2_refatorado;

// Usado para interagir com o back-end da aplicação
public class UIController {
	
	private DataReadRepository dataReadRepository;
	private DataWriteRepository dataWriteRepository;


	public void persist(Object object) {

		if (dataWriteRepository != null ) {
			dataWriteRepository.persist(object);
		}
	}
	
	public void retrieve(long id) {
		if (dataReadRepository != null ) {
			dataReadRepository.read(id);
		}
	}

	public void setDataReadRepository(DataReadRepository dataReadRepository) {
		this.dataReadRepository = dataReadRepository;
	}

	public void setDataWriteRepository(DataWriteRepository dataWriteRepository) {
		this.dataWriteRepository = dataWriteRepository;
	}
}
