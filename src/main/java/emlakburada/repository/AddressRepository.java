package emlakburada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import emlakburada.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
