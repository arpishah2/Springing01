package com.springing.Springing01.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessagePrinterService implements InitializingBean, DisposableBean {
   
    private MessageOfTheDayService service;
    
    public MessagePrinterService() {
    	System.out.println("MessagePrinterService: no-args constructor called ");
    }
    
    public MessagePrinterService(final MessageOfTheDayService service) {
    	System.out.println("MessagePrinterService: args-constructor called ");
    	this.service = service;
    }
    
    public void init() {
    	System.out.println("MessagePrinterService: Init Called");
    }
    
    public void setMessageService(final MessageOfTheDayService service) {
    	this.service = service;
    }
    
    public void printMessage() {
        System.out.println(service.getMessage());
    }

	@Override
	public void destroy() throws Exception {
		System.out.println("MessagePrinterService: Destroy Called");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("MessagePrinterService: After Properties Called");
		
	}
        
}
