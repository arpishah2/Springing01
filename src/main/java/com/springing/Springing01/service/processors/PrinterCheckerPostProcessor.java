package com.springing.Springing01.service.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;

import com.springing.Springing01.service.MessagePrinterService;

public class PrinterCheckerPostProcessor implements BeanPostProcessor, PriorityOrdered{
private int order;
	
	@Override
	public int getOrder() {
		return order;
	}
	
	public void setOrder(final int order) {
		this.order = order;
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof MessagePrinterService) {
			System.out.println("PrinterCheckerPostProcessor-->BeforeInitialization: "+beanName);
		}
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof MessagePrinterService) {
			System.out.println("PrinterCheckerPostProcessor-->BeforeInitialization: "+beanName);
		}
		return bean;
	}
}
