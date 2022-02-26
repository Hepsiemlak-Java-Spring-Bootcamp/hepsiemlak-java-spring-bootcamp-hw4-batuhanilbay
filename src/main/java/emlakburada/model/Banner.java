package emlakburada.model;

import javax.persistence.CascadeType;
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
public class Banner {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String advertNo;
	private String bannerContent;
	private String phone;
	private int total;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;
	
	public Banner(String bannerContent,int total) {
		this.bannerContent = bannerContent;
		this.total = total;
		
		
	}
	

}
