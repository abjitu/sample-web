package com.sample.web;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.dandelion.core.web.DandelionFilter;
import com.github.dandelion.core.web.DandelionServlet;
import com.github.dandelion.datatables.core.web.filter.DatatablesFilter;

@Configuration
public class DandelionConfig {

	@Bean
	public FilterRegistrationBean dandelionFilterRegistrationBean() {
		return new FilterRegistrationBean(new DandelionFilter());
	}

	@Bean
	public FilterRegistrationBean datatableFilterRegistrationBean() {
		return new FilterRegistrationBean(new DatatablesFilter());
	}

	@Bean
	public ServletRegistrationBean dandelionServletRegistrationBean() {
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new DandelionServlet(),
				"/dandelion-assets/*");
		servletRegistrationBean.setLoadOnStartup(2);
		return servletRegistrationBean;
	}

}