package com.springing.Springing01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springing.Springing01.service.BasicMessageOfTheDayImpl;
import com.springing.Springing01.service.MessagePrinterService;

public class Client {

	public static void main(final String[] args) {
		try (final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring/application.xml")) {
			context.registerShutdownHook();

			final BasicMessageOfTheDayImpl basicMessageService = (BasicMessageOfTheDayImpl) context.getBean("basicMessageOfDay");
			basicMessageService.setMessage("Hiiii");
			System.out.println(basicMessageService.getMessage());
			
			final BasicMessageOfTheDayImpl basicMessageService2 = (BasicMessageOfTheDayImpl) context.getBean("basicMessageOfDay");
			System.out.println(basicMessageService2.getMessage());
			
			// configuration
			//final MessagePrinterService printer = (MessagePrinterService) context.getBean("printer");
			
			// call print message
			//printer.printMessage();

		} catch (final Exception ex) {
			ex.printStackTrace();
		}
	}
}
