package emlakburada.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import emlakburada.model.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false)
	private int id;
	@Enumerated(EnumType.STRING)
	private UserType userType; // bireysel & kurumsal & yeniTip
	private String name;
	private String email;
	private String photo;
	private String bio;
	@OneToMany
	private List<Message> messages;
	@OneToMany
	private List<Advert> adverts;
	

	

	public User(UserType userType, String name, String email) {
		super();
		this.userType = userType;
		this.name = name;
		this.email = email;
	}


}
