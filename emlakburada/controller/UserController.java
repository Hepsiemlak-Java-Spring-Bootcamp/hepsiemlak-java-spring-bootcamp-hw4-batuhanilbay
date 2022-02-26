package emlakburada.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import emlakburada.model.entity.User;
import emlakburada.service.abstracts.UserHService;



@RestController
public class UserController {

	@Autowired
	private UserHService userService;
	
	//Tüm kullanıcıları getirme
	@GetMapping(value = "/users")
	public ResponseEntity<List<User>> getAllUser(){
		return ResponseEntity.ok().body(userService.getAllUser());
	}
	
	//İsteğe bağlı userId göre kullanıcı getirme
	@GetMapping(value = "/users/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable int userId) {
		return ResponseEntity.ok().body(userService.getUserById(userId));
		
	}
	
	//Kullanıcı oluşturma 
	@PostMapping(value = "/user")
	public ResponseEntity<User> createUser(@RequestBody User user){
		return ResponseEntity.ok().body(this.userService.createUser(user));
		
	}
	
	//Kullanıcı güncelleme
	@PutMapping(value = "/users")
	public ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable int userId){
		return ResponseEntity.ok().body(this.userService.updateUser(user, userId));
	}
	
	//Kullanıcı Silme
	@DeleteMapping(value = "/users/{userId}")
	public User deleteUser(@PathVariable int userId) {
		return this.userService.deleteUser(userId);
	}
}
