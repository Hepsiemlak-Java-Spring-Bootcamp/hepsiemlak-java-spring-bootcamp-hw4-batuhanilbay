package emlakburada.model.response;

import java.util.List;

import emlakburada.model.entity.Advert;
import emlakburada.model.entity.Image;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvertResponse {
	
	private Advert advert;
	private List<Image> image;

}
