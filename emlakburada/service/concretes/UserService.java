package emlakburada.service.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emlakburada.model.entity.User;
import emlakburada.repository.UserRepository;
import emlakburada.service.abstracts.UserHService;

@Service
public class UserService implements UserHService {

	@Autowired
	private UserRepository userRepository;

	
	//CRUD OPERATIONS 
	
	
	//Yeni kullanıcı oluşturma
	@Override
	public User createUser(User user) {
		return userRepository.save(user);
		
	}

	//Kullanıcının mail ve isim güncellemesi yapmasına olanak sağlıyoruz.
	@Override
	public User updateUser(User user,int userId) {
		User updateUser = userRepository.findById(userId).get();
		updateUser.setEmail(user.getEmail());
		updateUser.setName(user.getName());
		return userRepository.save(updateUser);
		
	}

	//Kullanıcı id göre bulabiliriz.
	@Override
	public User getUserById(int userId) {
		
		return userRepository.findById(userId).orElse(null);
		
	}

	//Kullanıcıyı userId'ye göre silebiliriz.
	@Override
	public User deleteUser(int userId) {
		User user = userRepository.findById(userId).get();
		userRepository.deleteById(userId);
		return user;
		
	}

	//Tüm kullanıcıları getirebiliriz.
	@Override
	public List<User> getAllUser() {
		return this.userRepository.findAll();
		
	}

	
}
