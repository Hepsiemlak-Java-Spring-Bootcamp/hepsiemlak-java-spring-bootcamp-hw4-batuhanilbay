package emlakburada.model.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import emlakburada.model.enums.SendReceive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String baslik;
	private String icerigi;
	private Date gonderilenTarih;
	private Date okunduguTarihi;
	private boolean gorulduMu;
	
	@Enumerated(EnumType.STRING)
	private SendReceive sendUserId;
	
	
	@Enumerated(EnumType.STRING)
	private SendReceive receiveUserId;
	


	
	
	public Message(String title,String content,SendReceive sendUserId,SendReceive receiveUserId) {
		super();
		this.baslik = title;
		this.icerigi=content;
		this.sendUserId = sendUserId;
		this.receiveUserId = receiveUserId;
		
	}

}
