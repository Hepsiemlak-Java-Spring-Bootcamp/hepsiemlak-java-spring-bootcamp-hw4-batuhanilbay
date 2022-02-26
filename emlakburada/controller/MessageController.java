package emlakburada.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import emlakburada.model.entity.Advert;
import emlakburada.model.entity.Image;
import emlakburada.model.entity.Message;
import emlakburada.model.entity.User;
import emlakburada.model.request.AdvertCreateRequest;
import emlakburada.model.request.MessageCreateRequest;
import emlakburada.repository.MessageRepository;
import emlakburada.service.abstracts.MessageHService;

@RestController
public class MessageController {
	
	@Autowired
	MessageHService messageService;
	
	@Autowired
	MessageRepository messageRepository;
	
	@GetMapping(value = "/messages")
	public List<Message> getAllMessage(){
		return messageService.getAllMessage();
	}

	@GetMapping(value = "/messages/{messageId}")
	public Message getMessageById(@PathVariable int messageId) {
		return messageService.getMessageById(messageId);
		
	}
	/*
	@PostMapping(value = "/message")
	public Message createMessage(@RequestBody Message message){
		return messageService.createMessage(message);
		
	}*/
	
	@PostMapping(value = "/message")
	public boolean createMessage(@RequestBody MessageCreateRequest messageCreateRequest){
		
		Message message = messageService.createMessage(new Message(messageCreateRequest.getTitle(),
				messageCreateRequest.getContent(),
				messageCreateRequest.getSendUser(),
				messageCreateRequest.getReceiveUser()));
		
		
		
		
		return true;
	}
	
	
	
	@PutMapping(value = "/messages")
	public Message updateMessage(@RequestBody Message message,@PathVariable int messageId){
		return messageService.updateMessage(message, messageId);
	}
	

	@DeleteMapping(value = "/messages/{messageId}")
	public Message deleteMessage(@PathVariable int messageId) {
		return this.messageService.deleteMessage(messageId);
	}

}
