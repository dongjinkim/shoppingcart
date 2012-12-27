package com.jinsoft.shoppingcart.core;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

@Configuration
public class RepositoryConfig {
	@Bean 
	public SessionFactory getSessionFactory() {
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(getDataSource());
		sessionFactoryBean.setHibernateProperties(getHibernateProperties());
		sessionFactoryBean.setPackagesToScan(new String[] { "com.jinsoft.shoppingcart.core" });
		// TODO
		return null;
	}
	
	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager htm = new HibernateTransactionManager();
		htm.setSessionFactory(getSessionFactory());
		
		return htm;
	}
	
	@Bean
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		
		return dataSource;
	}

	@Bean
	public Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", hibernateDialect);
		properties.put("hibernate.show_sql", hibernateShowSql);
		properties.put("hibernate.hbm2ddl.auto", hibernateHbm2ddlAuto);
		
		return properties;
	}

	@Value("${jdbc.driverUserClass}") private String driverClassName;	
	@Value("${jdbc.url}") private String url;	
	@Value("${jdbc.username}") private String username;
	@Value("${jdbc.password}") private String password;

	@Value("${hibernate.dialect}") private String hibernateDialect;
	@Value("${hibernate.show_sql}") private String hibernateShowSql;
	@Value("${hibernate.hbm2ddl.auto}") private String hibernateHbm2ddlAuto;
}
