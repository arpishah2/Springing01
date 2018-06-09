package com.springing.Springing01;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springing.Springing01.service.MessagePrinterService;

public class Client {

	public static void main(final String[] args) {

		//configuration 
		final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/application.xml");
		final MessagePrinterService printer = (MessagePrinterService) context.getBean("printer"); 
				
		//call print message
		printer.printMessage();
		

	}
}
