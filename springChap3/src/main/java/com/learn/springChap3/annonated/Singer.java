package com.learn.springChap3.annonated;

import org.springframework.stereotype.Component;

@Component("Drake")
public class Singer {
	private	String	lyric	=	"She asked me do you love me, I told her only partly, "
			+ "I only love my bed and my momma, I'm sorry";
	
	public	void	sing() {
		System.out.println(lyric);
	}
}
