package emlakburada.service.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emlakburada.model.Address;
import emlakburada.repository.AddressRepository;
import emlakburada.service.abstracts.AddressHService;

@Service
public class AddressService implements AddressHService {

	@Autowired
	private AddressRepository addressRepository;
	
	
	
	@Override
	public Address createAddress(Address address) {
		return addressRepository.save(address);
	}

	@Override
	public Address updateAddress(Address address, int addressId) {
		Address updateAddress = addressRepository.findById(addressId).get();
		updateAddress.setAddressContent(address.getAddressContent());;
		updateAddress.setCity(address.getCity());;
		updateAddress.setDistrict(address.getDistrict());
		updateAddress.setBanner(address.getBanner());
		return addressRepository.save(updateAddress);
	}

	@Override
	public Address deleteAddress(int addressId) {
		Address address = addressRepository.findById(addressId).get();
		addressRepository.deleteById(addressId);
		return address;
	}

	@Override
	public Address getAddressById(int addressId) {
		return addressRepository.findById(addressId).orElse(null);
	}

	@Override
	public List<Address> getAllAddress() {
		return this.addressRepository.findAll();
	}

	
	
}
