package emlakburada.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import emlakburada.model.entity.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message,Integer>{

}
