package emlakburada.service.abstracts;

import java.util.List;

import emlakburada.model.Address;

public interface AddressHService {

	
	Address createAddress(Address address);
	
	Address updateAddress(Address address,int addressId);
	
	Address deleteAddress(int addressId);
	
	Address getAddressById(int addressId);
	
	List<Address> getAllAddress();

	
}
