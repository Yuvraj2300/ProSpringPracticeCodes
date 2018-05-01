package com.learn.springChap3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DependsOnDemo {
	public static void main(String[] args) {
		GenericXmlApplicationContext	ctx	=	new	GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-01.xml");
		ctx.refresh();
		
		Singer	drake	=	ctx.getBean(Singer.class);
		drake.sing();
	}
}
