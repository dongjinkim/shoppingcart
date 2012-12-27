package com.jinsoft.shoppingcart.core;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;

@Import({RepositoryConfig.class})
@Configuration
public class AppConfig {

	@Bean 
	public PropertyPlaceholderConfigurer getPropertyPlaceholderConfigurer() {
		PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
		ppc.setLocation(new ClassPathResource("spring/application.properties"));
		ppc.setIgnoreUnresolvablePlaceholders(true);
		
		return ppc;
	}
}

