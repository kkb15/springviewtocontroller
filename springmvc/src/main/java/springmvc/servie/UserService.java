package springmvc.servie;

import org.springframework.beans.factory.annotation.Autowired;

import springmvc.dao.UserDao;
import springmvc.model.User;

public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	
	public int ceateUser(User user) {
		return this.userDao.saveUser(user);
		
	}


	


	

}
