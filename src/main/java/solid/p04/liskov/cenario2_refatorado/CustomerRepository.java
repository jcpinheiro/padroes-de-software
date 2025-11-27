package solid.p04.liskov.cenario2_refatorado;

public class CustomerRepository implements DataReadRepository, DataWriteRepository  {

	private DataRepository dataRepository;

	@Override
	public void persist(Object objeto) {
		// TODO salva o objeto no banco de dados
		dataRepository.persist(objeto);
	}

	@Override
	public Object read(long id) {
		return dataRepository.read(id);
	}


}
