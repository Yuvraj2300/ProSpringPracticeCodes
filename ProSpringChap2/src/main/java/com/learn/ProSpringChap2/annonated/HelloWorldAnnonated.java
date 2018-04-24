package com.learn.ProSpringChap2.annonated;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learn.ProSpringChap2.decoupled.MessageRenderer;
import com.learn.ProSpringChap2.decoupled.StdOutMessageRenderer;

public class HelloWorldAnnonated {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		MessageRenderer mr = ctx.getBean(StdOutMessageRenderer.class);
		mr.render();
	}
}
