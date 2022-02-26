package emlakburada.service.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import emlakburada.model.entity.Message;
import emlakburada.repository.MessageRepository;
import emlakburada.service.abstracts.MessageHService;


@Service
public class MessageService implements MessageHService{

	@Autowired
	MessageRepository messageRepository;
	
	
	@Override
	public Message createMessage(Message message) {
		return messageRepository.save(message);
		
	}

	@Override
	public Message updateMessage(Message message, int messageId) {
		Message updateMessage = messageRepository.findById(messageId).get();
		updateMessage.setBaslik(message.getBaslik());
		updateMessage.setReceiveUserId(message.getReceiveUserId());
		return messageRepository.save(updateMessage);
		
	}

	@Override
	public Message getMessageById(int messageId) {
		
		return messageRepository.findById(messageId).orElse(null);
		
	}

	@Override
	public Message deleteMessage(int messageId) {
		Message message = messageRepository.findById(messageId).get();
		messageRepository.deleteById(messageId);
		return message;
	}

	@Override
	public List<Message> getAllMessage() {
		return this.messageRepository.findAll();
	}

	
	
	
}
