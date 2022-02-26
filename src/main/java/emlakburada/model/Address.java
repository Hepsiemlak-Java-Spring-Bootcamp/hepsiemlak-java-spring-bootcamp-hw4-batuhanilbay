package emlakburada.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String city;
	private String district;
	private String addressContent;
	@OneToOne(mappedBy = "address")
	private Banner banner;
	

	public Address(String city,String district,String addressContent) {
		this.city=city;
		this.district=district;
		this.addressContent=addressContent;
		
	}
	
}
