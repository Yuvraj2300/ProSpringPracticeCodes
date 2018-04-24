package com.learn.ProSpringChap2.decoupled;

public class HelloWorldMessageProvider implements	MessageProvider{

	public String getMessage() {
		// TODO Auto-generated method stub
		return new	String("Hello World!!!!");
	}

}
