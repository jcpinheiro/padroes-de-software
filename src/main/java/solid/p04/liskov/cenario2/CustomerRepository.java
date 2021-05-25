package solid.p04.liskov.cenario2;

public class CustomerRepository implements DataRepository {

	@Override
	public void persist(Object objeto) {
		// TODO salva o objeto no banco de dados
	}

	@Override
	public Object read(long id) {
		// TODO lê o objeto do banco de dados
		return null;
	}

}
