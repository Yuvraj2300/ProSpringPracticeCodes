package com.learn.springChap3.annonated;

import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AnnonatedBeanNaming {
	public static void main(String[] args) {
		GenericXmlApplicationContext	ctx	=	new	GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-annonated.xml");
		ctx.refresh();
		
		Map<String, Singer>	beans	=	ctx.getBeansOfType(Singer.class);
		
		beans.entrySet().stream().forEach(b->{
			System.out.println("id: "+b.getKey());
			System.out.println();
		});
		ctx.close();
	}
}
