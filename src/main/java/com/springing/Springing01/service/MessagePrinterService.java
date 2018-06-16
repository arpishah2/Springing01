package com.springing.Springing01.service;

public class MessagePrinterService {
   
    private MessageOfTheDayService service;
    
    public MessagePrinterService(String message, String args2, final MessageOfTheDayService service) {
    	this.service = service;
    }
    
    public void printMessage() {
        System.out.println(service.getMessage());
    }
        
}
