package emlakburada.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import emlakburada.model.entity.Advert;
import emlakburada.model.entity.Image;
import emlakburada.model.request.AdvertCreateRequest;
import emlakburada.model.response.AdvertResponse;
import emlakburada.repository.ImageRepository;
import emlakburada.service.abstracts.AdvertHService;


@RestController
public class AdvertController {

	@Autowired
	private AdvertHService advertService;
	
	@Autowired
	private ImageRepository imageRepository;
	
	@GetMapping(value = "/adverts")
	public ResponseEntity<List<Advert>> getAllAdvert(){
		return ResponseEntity.ok().body(advertService.getAllAdvert());
	}

	@GetMapping(value = "/advert/{advertId}")
	public ResponseEntity<Advert> getAdvertById(@PathVariable int advertId) {
		return ResponseEntity.ok().body(advertService.getAdvertById(advertId));
		
	}
	

	@GetMapping(value = "/adverts/{userId}")
	public List<AdvertResponse> getAdvertsByUserId(@PathVariable String userId) {
		int id =Integer.parseInt(userId);
		List<Advert> listAdverts = advertService.getAdvertsByUserId(id);
		ArrayList<AdvertResponse> advertResponse = new ArrayList<AdvertResponse>();
		for(Advert advert : listAdverts) {
			List<Image> imagesListByAdvertId = new ArrayList(imageRepository.getImagesByAdvertId(advert.getId()));
			advertResponse.add(new AdvertResponse(advert,imagesListByAdvertId));
		}

		return advertResponse;
		
	}
	
	
	
	@PostMapping(value = "/advert")
	public boolean createAdvert(@RequestBody AdvertCreateRequest advertRequest){
		
		Advert advert = advertService.createAdvert(new Advert(advertRequest.getBaslik(),
				advertRequest.isAktifMi(),advertRequest.isOneCikarilsinMi(),advertRequest.getUserId()));
		
		for(String imageUrl: advertRequest.getImageUrl()) {
			imageRepository.save(new Image(imageUrl,advert.getId()));
		}
		return true;
	}
	
	
	@PutMapping(value = "/adverts")
	public ResponseEntity<Advert> updateAdvert(@RequestBody Advert advert,@PathVariable int advertId){
		return ResponseEntity.ok().body(this.advertService.updateAdvert(advert, advertId));
	}
	

	@DeleteMapping(value = "/adverts/{advertId}")
	public Advert deleteAdvert(@PathVariable int advertId) {
		return this.advertService.deleteAdvert(advertId);
	}

	

}
