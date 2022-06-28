package padroes.p13.adapter.cenario04.core.usecases;

import padroes.p13.adapter.cenario04.core.model.User;
import padroes.p13.adapter.cenario04.core.ports.UserRepository;

import java.util.List;

public class UserService {
	private UserRepository userRepo;

	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	public void saveUser(User user) {
		boolean alreadyUsedEmail =
				userRepo.getAll()
						.stream()
						.anyMatch(userDb -> userDb.getEmail().equalsIgnoreCase(user.getEmail()));

		if(alreadyUsedEmail)
			throw new RuntimeException("Email address already exists!");

		userRepo.save(user);
	}
	
	public List<User> getUsers() {
		return userRepo.getAll();
	}
	
}
