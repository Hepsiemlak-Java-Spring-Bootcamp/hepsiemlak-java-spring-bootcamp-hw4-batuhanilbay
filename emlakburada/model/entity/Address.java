package emlakburada.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Address {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String city;
	private String district;
	private String content;
	@OneToOne(mappedBy = "address")
	@JoinColumn(name="advert_id")
	private Advert advert;
	

}
