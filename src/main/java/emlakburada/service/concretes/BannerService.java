package emlakburada.service.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import emlakburada.model.Banner;
import emlakburada.repository.BannerRepository;
import emlakburada.service.abstracts.BannerHService;

@Service
public class BannerService implements BannerHService{

	@Autowired
	private BannerRepository bannerRepository;
	
	
	@Override
	public Banner createBanner(Banner banner) {
		return bannerRepository.save(banner);
		
	}

	@Override
	public Banner updateBanner(Banner banner, int bannerId) {
		Banner updateBanner = bannerRepository.findById(bannerId).get();
		updateBanner.setAddress(banner.getAddress());;
		updateBanner.setTotal(banner.getTotal());;
		updateBanner.setPhone(banner.getPhone());;
		return bannerRepository.save(updateBanner);
	}

	@Override
	public Banner deleteBanner(int bannerId) {
		Banner banner = bannerRepository.findById(bannerId).get();
		bannerRepository.deleteById(bannerId);
		return banner;
	}

	@Override
	public Banner getBannerById(int bannerId) {
		return bannerRepository.findById(bannerId).orElse(null);
	}

	@Override
	public List<Banner> getAllBanner() {
		return this.bannerRepository.findAll();
	}



}
