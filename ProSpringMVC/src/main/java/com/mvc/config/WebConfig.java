package com.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.mvc")
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/").setCachePeriod(31556926);
	}

	@Bean
	InternalResourceViewResolver	viewResolver() {
		InternalResourceViewResolver	resolver	=	new	InternalResourceViewResolver("/WEB-INF/views", ".jspx");
		resolver.setRequestContextAttribute("requestContext");
		return	resolver;
	}
	
	@Override
	public	void	addViewControllers(ViewControllerRegistry	registry) {
		registry.addViewController("/").setViewName("singers/list");
	}
	
	@Override
	public	void	configureDefaultServletHandling(DefaultServletHandlerConfigurer	configurer) {
		configurer.enable();
	}
	
	
}
