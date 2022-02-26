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
import emlakburada.dto.request.BannerRequest;
import emlakburada.model.Banner;
import emlakburada.service.abstracts.BannerHService;

@RestController
public class BannerController {

	@Autowired
	private BannerHService bannerService;
	

	@GetMapping(value = "/banners")
	public List<Banner> getAllBanner(){
		return bannerService.getAllBanner();
	}
	
	@GetMapping(value = "/banners/{bannerId}")
	public Banner getBannerById(@PathVariable int bannerId) {
		return bannerService.getBannerById(bannerId);
		
	}
	
	@PostMapping(value = "/banner")
	public boolean createBanner(@RequestBody BannerRequest bannerRequest){
		
		Banner banner = bannerService.createBanner(new Banner(bannerRequest.getBannerContent(),
				bannerRequest.getTotal()));
		return true;
	}
	
	@PutMapping(value = "/banners")
	public Banner updateBanner(@RequestBody Banner banner,@PathVariable int bannerId){
		return bannerService.updateBanner(banner, bannerId);
	}
	

	@DeleteMapping(value = "/banners/{bannerId}")
	public Banner deleteBanner(@PathVariable int bannerId) {
		return this.bannerService.deleteBanner(bannerId);
	}

}
