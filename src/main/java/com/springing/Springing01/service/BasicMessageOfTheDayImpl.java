package com.springing.Springing01.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BasicMessageOfTheDayImpl implements MessageOfTheDayService, InitializingBean, DisposableBean {

	private String message = "Hello World";

	public BasicMessageOfTheDayImpl(){
		System.out.println("BasicMessageOfTheDayImpl: args-constructor called");
	}
	
    public void init() {
    	System.out.println("BasicMessageOfTheDayImpl: Init Called");
    }
    
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("BasicMessageOfTheDayImpl: Destroy Called");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("BasicMessageOfTheDayImpl: afterProperties Called");
		
	}

}
