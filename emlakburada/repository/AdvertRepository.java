package emlakburada.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import emlakburada.model.entity.Advert;

@Repository
public interface AdvertRepository extends JpaRepository<Advert, Integer> {

	@Query(value = "select * from advert where USER_ID = :value",nativeQuery = true)
	Collection<Advert> getAdvertsByUserId(@Param("value") int value);
}
