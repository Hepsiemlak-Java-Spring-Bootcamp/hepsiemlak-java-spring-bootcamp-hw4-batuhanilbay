package emlakburada.repository;

import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import emlakburada.model.entity.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer>{


	@Query(value = "select * from image where ADVERT_ID = :value",nativeQuery = true)
	Collection<Image> getImagesByAdvertId(@Param("value") int value);
	
	
}

