package emlakburada.service.abstracts;

import java.util.List;

import emlakburada.model.entity.User;

public interface UserHService {
	
	User createUser(User user);
	
	User updateUser(User user,int userId);
	
	User getUserById(int userId);
	
	User deleteUser(int userId);
	
	
	List<User> getAllUser();
	

}
