package emlakburada.service.abstracts;

import java.util.List;
import emlakburada.model.entity.Advert;


public interface AdvertHService {

	
	Advert createAdvert(Advert advert);
	
	Advert updateAdvert(Advert advert,int advertId);
	
	Advert getAdvertById(int advertId);
	
	Advert deleteAdvert(int advertId);
	
	List<Advert> getAdvertsByUserId(int userId);
	
	List<Advert> getAllAdvert();
	
	
}
