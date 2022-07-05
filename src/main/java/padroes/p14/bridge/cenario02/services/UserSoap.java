package padroes.p14.bridge.cenario02.services;

import padroes.p14.bridge.cenario02.dao.UserDao;
import padroes.p14.bridge.cenario02.model.User;

public class UserSoap extends UserService {

	public UserSoap(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {
		System.out.println("Starting a save operation through Soap Protocol!");
		dao.save(user);
	}
}
