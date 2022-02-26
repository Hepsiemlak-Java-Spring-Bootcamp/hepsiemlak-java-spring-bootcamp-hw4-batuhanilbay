package emlakburada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import emlakburada.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	
	
	
}
