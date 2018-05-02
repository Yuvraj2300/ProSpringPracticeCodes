/**
 * 
 */
package com.learn.springChap3.inherit.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author ysharma
 *
 */
public class InheritanceDemo {
	static public void main(String[] args) {
		GenericXmlApplicationContext	ctx	=	new	GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-xml.xml");
		ctx.refresh();
		
		Singer	parent	=	(Singer)	ctx.getBean("parent");
		Singer	child	=	(Singer)	ctx.getBean("child");
		
		System.out.println("Parent\n"+parent);
		System.out.println("Child\n"+child);
	}
}
