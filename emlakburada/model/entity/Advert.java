package emlakburada.model.entity;

import java.math.BigDecimal;
import java.util.Date;

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

public class Advert {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int advertNo;
	private String baslik;
	//One-to-One Relationships Between ADVERT AND ADDRESS
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")	
	private User userId;
	
	private String[] resimList = new String[5];
	private BigDecimal fiyat;
	private boolean oneCikarilsinMi = false;
	private boolean incelendiMi = false;
	private Date olusturulmaTarihi;
	private boolean aktifMi;
	
	
	public Advert(String baslik, boolean aktifMi, boolean oneCikarilsinMi, User userId) {
		super();
		this.baslik = baslik;
		this.aktifMi = aktifMi;
		this.oneCikarilsinMi = oneCikarilsinMi;
		this.userId = userId;
		
	}
	
	public boolean getAktifMi() {
		return aktifMi;
	}
	
	public void setAktifMi(boolean aktifMi) {
		this.aktifMi = aktifMi;
		
	}
	
	

}
