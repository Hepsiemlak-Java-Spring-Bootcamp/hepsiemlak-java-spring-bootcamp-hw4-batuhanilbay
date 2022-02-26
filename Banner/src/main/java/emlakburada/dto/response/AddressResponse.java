package emlakburada.dto.response;

import emlakburada.dto.request.BannerRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {
	
	private String city;
	private String district;
	private BannerRequest banner;
	

}
