package emlakburada.model.request;

import emlakburada.model.entity.User;
import emlakburada.model.enums.SendReceive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageCreateRequest {

	
	private String title;
	private String content;
	private SendReceive sendUser;
	private SendReceive receiveUser;
}
