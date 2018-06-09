package com.springing.Springing01.service;

public class MessagePrinterService {
   
    private MessageOfTheDayService service;

    
    public void printMessage() {
        System.out.println(service.getMessage());
    }
        
    public void setMessageService(final MessageOfTheDayService service){
    	this.service = service;
    }
	
}
