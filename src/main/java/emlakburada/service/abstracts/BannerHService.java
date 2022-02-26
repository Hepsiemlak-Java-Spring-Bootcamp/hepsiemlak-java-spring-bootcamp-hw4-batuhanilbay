package emlakburada.service.abstracts;

import java.util.List;
import emlakburada.model.Banner;

public interface BannerHService {
	
	Banner createBanner(Banner banner);
	
	Banner updateBanner(Banner banner,int bannerId);
	
	Banner deleteBanner(int bannerId);
	
	Banner getBannerById(int bannerId);
	
	List<Banner> getAllBanner();

	
	
	

}
