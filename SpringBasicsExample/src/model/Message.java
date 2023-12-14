package model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Message {
	private int messageId;
	private String message;
	
	
	public Message() {
		super();
		System.out.println("Message Constructor");
		// TODO Auto-generated constructor stub
	}
	
	public Message(int messageId, String message) {
		super();
		this.messageId = messageId;
		this.message = message;
	}

	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
		System.out.println("MessageId setter");
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
		System.out.println("Message setter");
	}
	
	@PostConstruct
	public void init() throws Exception{
		System.out.println("Bean is going through init process..");
	}
	@PreDestroy
	public void destroy() throws Exception{
		System.out.println("Bean is going to destroy");
	}
}
