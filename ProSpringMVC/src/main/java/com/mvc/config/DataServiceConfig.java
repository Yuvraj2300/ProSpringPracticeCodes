package com.mvc.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaAuditing
@ComponentScan
public class DataServiceConfig {

	public DataSource dataSource() {
		try {
			EmbeddedDatabaseBuilder dbBuilder = new EmbeddedDatabaseBuilder();
			return dbBuilder.setType(EmbeddedDatabaseType.H2).build();
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}
	
	@Bean
	public	Properties	hibernateProperites() {
		Properties	hibernate	=	new	Properties();
		hibernate.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		hibernate.put("hibernate.hbm2ddl.auto", "create-drop");
		hibernate.put("hibernate.show_sql", true);
		return	hibernate;
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		return new JpaTransactionManager(entityManagerFactory());
	}

	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		return new HibernateJpaVendorAdapter();
	}
	
	@Bean
	private EntityManagerFactory entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean	factoryBean	=	new	LocalContainerEntityManagerFactoryBean();
		factoryBean.setPackagesToScan("com.mvc.entities");
		factoryBean.setDataSource(dataSource());
		factoryBean.setJpaVendorAdapter(new	HibernateJpaVendorAdapter());
		factoryBean.setJpaProperties(hibernateProperites());
		factoryBean.setJpaVendorAdapter(jpaVendorAdapter());
		factoryBean.afterPropertiesSet();
		return factoryBean.getNativeEntityManagerFactory();
	}
}
