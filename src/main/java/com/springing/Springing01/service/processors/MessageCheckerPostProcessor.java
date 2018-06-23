package com.springing.Springing01.service.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;

import com.springing.Springing01.service.MessageOfTheDayService;

public class MessageCheckerPostProcessor implements BeanPostProcessor, PriorityOrdered{

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
		if(bean instanceof MessageOfTheDayService) {
			final MessageOfTheDayService service = (MessageOfTheDayService) bean;
			if(!"".equals(service.getMessage())) {
				System.out.println("MessageCheckerPostProcessor-->BeforeInitialization: "+beanName+ " contains: "+service.getMessage());
			}
		}
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof MessageOfTheDayService) {
			final MessageOfTheDayService service = (MessageOfTheDayService) bean;
			if(!"".equals(service.getMessage())) {
				System.out.println("MessageCheckerPostProcessor-->AfterInitialization: "+beanName+ " contains: "+service.getMessage());
			}
		}
		return bean;
	}
}
