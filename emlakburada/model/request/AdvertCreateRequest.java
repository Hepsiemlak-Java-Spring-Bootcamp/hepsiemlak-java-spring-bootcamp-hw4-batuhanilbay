package emlakburada.model.request;

import java.util.List;

import emlakburada.model.entity.Address;
import emlakburada.model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AdvertCreateRequest {

	private String baslik;
	private boolean aktifMi;
	private boolean oneCikarilsinMi;
	private User userId;
	private Address address;
	
	private List<String> imageUrl;
	
	
	
	
	
}
