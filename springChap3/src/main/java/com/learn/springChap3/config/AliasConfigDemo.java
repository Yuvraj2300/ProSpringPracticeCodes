package com.learn.springChap3.config;

import java.util.Arrays;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.GenericApplicationContext;

import com.learn.springChap3.annonated.Singer;

public class AliasConfigDemo {

	public static class AliasBean {
		@Bean(name= {"Drake", "Aubrey Graham", "Drizzy","6God"})
		public Singer singer() {
			return new Singer();
		}
	}

	public static void main(String[] args) {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AliasBean.class);

		Map<String, Singer> beans = ctx.getBeansOfType(Singer.class);
		
		beans.entrySet().stream().forEach(b -> System.out
				.println("id: " + b.getKey() 
				+ "\n aliases: " + Arrays.toString(ctx.getAliases(b.getKey())) + "\n"));

		ctx.close();
	}

}
