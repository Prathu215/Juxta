package com.juxta;

import com.juxta.filter.AuthorisationFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.Filter;

@SpringBootApplication
public class JuxtaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JuxtaApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean someFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(getAuthorisationFilter());
		registration.addUrlPatterns("/*");
//		registration.addInitParameter("paramName", "paramValue");
		registration.setName("AuthorisationFilter");
		registration.setOrder(1);
		return registration;
	}

	public Filter getAuthorisationFilter() {
		return new AuthorisationFilter();
	}
}
