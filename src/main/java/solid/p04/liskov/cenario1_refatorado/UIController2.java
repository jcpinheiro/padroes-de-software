package solid.p04.liskov.cenario1_refatorado;

// Usado para interagir com o back-end da aplicação
public class UIController2 {
	
	public void persist(Object object, DataWriteRepository dataWriteRepository) {
			dataWriteRepository.persist(object);
	}
	
	public void retrieve(long id, DataReadRepository dataReadRepository) {
			dataReadRepository.read(id);
	}

}
