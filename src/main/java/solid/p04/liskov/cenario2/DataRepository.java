package solid.p04.liskov.cenario2;

public interface DataRepository  {
	void persist(Object objeto);
	Object read(long id);
}
