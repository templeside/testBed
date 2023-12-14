package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Message;
import model.Student;

public class Test1 {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("resources/Bean1.xml");
		
		Message message = ctx.getBean("message", Message.class);
		message.setMessage("Hello");
		message.setMessageId(101);
		Student student = ctx.getBean("student", Student.class);
		
		student.setName("Allen");
		student.setAge(20);
		student.setEmail("allen@gmail.com");
		
		System.out.println(message.getMessageId()+"\t"+message.getMessage());
		System.out.println(student.getName()+", "+ student.getAge()+", "+ student.getEmail());
		ctx.close();
	}
}
