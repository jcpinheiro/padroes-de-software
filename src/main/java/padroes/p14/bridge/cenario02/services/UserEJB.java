package padroes.p14.bridge.cenario02.services;

import padroes.p14.bridge.cenario02.dao.UserDao;
import padroes.p14.bridge.cenario02.model.User;

public class UserEJB extends UserService {

	public UserEJB(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {
		System.out.println("Starting a save operation through EJB Protocol!");
		dao.save(user);
	}
}
