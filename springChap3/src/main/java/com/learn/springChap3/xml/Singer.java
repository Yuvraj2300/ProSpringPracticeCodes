package com.learn.springChap3.xml;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Singer implements	ApplicationContextAware{

	ApplicationContext	ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.ctx=applicationContext;	
	}
	
	public	Singer() {
	};
	
	private	Guitar	guitar;
	
	public	void	sing() {
		guitar	=	ctx.getBean("gopher",Guitar.class);
		guitar.sing();
	}

}
