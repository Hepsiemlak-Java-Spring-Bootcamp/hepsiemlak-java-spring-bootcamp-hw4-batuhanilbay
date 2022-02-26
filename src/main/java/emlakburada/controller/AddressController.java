package emlakburada.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import emlakburada.dto.request.AddressRequest;
import emlakburada.model.Address;
import emlakburada.service.abstracts.AddressHService;

@RestController
public class AddressController {

	
	@Autowired
	private AddressHService addressService;
	
	
	@GetMapping(value = "/address")
	public List<Address> getAllAddress(){
		return addressService.getAllAddress();
	}
	
	@GetMapping(value = "/address/{addressId}")
	public Address getAddressById(@PathVariable int addressId) {
		return addressService.getAddressById(addressId);
		
	}
	
	@PostMapping(value = "/address")
	public boolean createAddress(@RequestBody AddressRequest addressRequest){
		
		Address address = addressService.createAddress(new Address(addressRequest.getCity(),
				addressRequest.getDistrict(),
				addressRequest.getAddressContent()));
		return true;
	}
	
	@PutMapping(value = "/address")
	public Address updateAddress(@RequestBody Address address,@PathVariable int addressId){
		return addressService.updateAddress(address, addressId);
	}
	

	@DeleteMapping(value = "/addresses/{addressId}")
	public Address deleteAddress(@PathVariable int addressId) {
		return this.addressService.deleteAddress(addressId);
	}
	
}
