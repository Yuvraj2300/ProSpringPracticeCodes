package com.learn.ProSpringChap2.annonated;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learn.ProSpringChap2.decoupled.HelloWorldMessageProvider;
import com.learn.ProSpringChap2.decoupled.MessageProvider;
import com.learn.ProSpringChap2.decoupled.MessageRenderer;
import com.learn.ProSpringChap2.decoupled.StdOutMessageRenderer;

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public	MessageProvider	provider() {
		return	new	HelloWorldMessageProvider();
	}
	
	@Bean
	public	MessageRenderer	renderer() {
		MessageRenderer	mr	=	new	StdOutMessageRenderer();
		mr.setMessageProvider(provider());
		return	mr;
	}
}
