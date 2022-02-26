package emlakburada.service.concretes;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emlakburada.model.entity.Advert;
import emlakburada.repository.AdvertRepository;
import emlakburada.service.abstracts.AdvertHService;


@Service
public class AdvertService implements AdvertHService{

	@Autowired
	private AdvertRepository advertRepository;
	
	
	
	@Override
	public Advert createAdvert(Advert advert) {
		return advertRepository.save(advert);
		
	}

	@Override
	public Advert updateAdvert(Advert advert, int advertId) {
		Advert updateAdvert = advertRepository.findById(advertId).get();
		updateAdvert.setAktifMi(advert.getAktifMi());
		updateAdvert.setBaslik(advert.getBaslik());
		updateAdvert.setFiyat(advert.getFiyat());
		return advertRepository.save(updateAdvert);
	}

	@Override
	public Advert getAdvertById(int advertId) {
		return advertRepository.findById(advertId).orElse(null);
	}

	@Override
	public Advert deleteAdvert(int advertId) {
		Advert advert = advertRepository.findById(advertId).get();
		advertRepository.deleteById(advertId);
		return advert;
	}

	@Override
	public List<Advert> getAllAdvert() {
		return this.advertRepository.findAll();
		
	}

	@Override
	public List<Advert> getAdvertsByUserId(int userId) {
		List<Advert> adverts = new ArrayList(advertRepository.getAdvertsByUserId(userId));
		return adverts;
	}


}
