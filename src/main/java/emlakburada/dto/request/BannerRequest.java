package emlakburada.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BannerRequest {
	
	private int advertNo;
	private String bannerContent;
	private String phone;
	private int total;
	private AddressRequest addressRequest;
	
	public BannerRequest(String bannerContent,int total,AddressRequest addressRequest) {
		this.bannerContent = bannerContent;
		this.total = total;
		this.addressRequest = addressRequest;
		
	}

}
