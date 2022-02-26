package emlakburada.service.abstracts;


import java.util.List;

import emlakburada.model.entity.Message;
public interface MessageHService {
	
	
	Message createMessage(Message message);
	
	Message updateMessage(Message message,int messageId);
	
	Message getMessageById(int messageId);
	
	Message deleteMessage(int messageId);
	
	
	List<Message> getAllMessage();

}
