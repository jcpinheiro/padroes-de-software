package padroes.p14.bridge.cenario02;


import padroes.p14.bridge.cenario02.dao.UserMongoDao;
import padroes.p14.bridge.cenario02.dao.UserMysqlDao;
import padroes.p14.bridge.cenario02.dao.UserOracleDao;
import padroes.p14.bridge.cenario02.dao.UserPostgresDao;
import padroes.p14.bridge.cenario02.model.User;
import padroes.p14.bridge.cenario02.services.UserEJB;
import padroes.p14.bridge.cenario02.services.UserRest;
import padroes.p14.bridge.cenario02.services.UserService;
import padroes.p14.bridge.cenario02.services.UserSoap;

public class Client {

	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");
		
		UserService userRestOracleService = new UserRest(new UserOracleDao() );
		userRestOracleService.save(user);
		
		UserService userEJBMongoService = new UserEJB(new UserMongoDao());
		userEJBMongoService.save(user);
		
		UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
		userSoapPostgresService.save(user);
		
		//.......
		
		UserService userRestMysqlService = new UserRest(new UserMysqlDao());
		userRestMysqlService.save(user);
		
	}
}
