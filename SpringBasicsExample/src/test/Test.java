package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Message;
import model.Student;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("resources/Beans.xml");
		
		Message message = ctx.getBean("message", Message.class);
		Student student = ctx.getBean("obj", Student.class);
		System.out.println(message.getMessageId()+"\t"+message.getMessage());
		System.out.println(student.getName()+", "+ student.getAge()+", "+ student.getEmail());
		ctx.close();
	}
}
