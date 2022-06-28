package padroes.p13.adapter.cenario04.core.ports;

import padroes.p13.adapter.cenario04.core.model.User;

import java.util.List;


public interface UserRepository {
	void save(User user);
	List<User> getAll();
}
