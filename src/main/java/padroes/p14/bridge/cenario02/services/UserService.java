package padroes.p14.bridge.cenario02.services;

import padroes.p14.bridge.cenario02.dao.UserDao;
import padroes.p14.bridge.cenario02.model.User;

public abstract class UserService {
	protected UserDao dao;

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(User user);
}
