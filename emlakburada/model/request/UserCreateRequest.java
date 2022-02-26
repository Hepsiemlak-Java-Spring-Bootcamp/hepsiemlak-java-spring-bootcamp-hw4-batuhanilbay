package emlakburada.model.request;

import emlakburada.model.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateRequest {
	
	
	private UserType userType;
	private String name;
	private String mail;
	
	

}
