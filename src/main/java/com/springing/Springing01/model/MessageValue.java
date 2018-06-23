package com.springing.Springing01.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageValue implements InitializingBean, DisposableBean{
	String message;
	
	MessageValue(String message){
		System.out.println("MessageValue: args-constructor called ");
		this.message = message;
	}

    public void init() {
    	System.out.println("MessageValue: Init Called");
    }
    
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("MessageValue: Destroy Called");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("MessageValue: afterProperties Called");
		
	}

}
