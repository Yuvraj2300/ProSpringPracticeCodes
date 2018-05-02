package com.learn.springChap3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Target {
	private	Foo	fooOne;
	private	Foo	fooTwo;
	private	Bar	bar;
	
	public	Target() {}
	public	Target(Foo	foo) {
		System.out.println("Target(Foo) set");
	}
	public	Target(Foo	foo,Bar	bar) {
		System.out.println("Target(Foo and Bar) set");
	}
	
	public Foo getFooOne() {
		return fooOne;
	}
	public void setFooOne(Foo fooOne) {
		this.fooOne = fooOne;
		System.out.println("Property fooOne set");
	}
	public Foo getFooTwo() {
		return fooTwo;
	}
	public void setFooTwo(Foo fooTwo) {
		this.fooTwo = fooTwo;
		System.out.println("Property fooTwo set");
	}
	public Bar getBar() {
		return bar;
	}
	public void setBar(Bar bar) {
		this.bar = bar;
		System.out.println("Property Bar set");
	}
	
	public static void main(String[] args) {
		GenericXmlApplicationContext	ctx	=	new	GenericXmlApplicationContext();
		ctx.load("spring/app-context-03.xml");
		ctx.refresh();
		
		Target	t	=	null;
		
		System.out.println("Using ByName\n");
		t	=	(Target)	ctx.getBean("targetByName");
		System.out.println();
		
		System.out.println("Using ByType\n");
		t	=	(Target)	ctx.getBean("targetByType");
		System.out.println();
		
		System.out.println("Using Costructor\n");
		t	=	(Target)	ctx.getBean("targetConstructor");
		System.out.println();
	}
	
}
