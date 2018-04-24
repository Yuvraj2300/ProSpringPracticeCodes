package com.learn.ProSpringChap2.decoupled;

public class HelloWorldDecoupled {
	public static void main(String[] args) {
		MessageRenderer	mr	=	new	StdOutMessageRenderer();
		MessageProvider	mp	=	new	HelloWorldMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();
	}
}
