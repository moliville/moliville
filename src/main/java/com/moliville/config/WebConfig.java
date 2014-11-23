package com.moliville.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com.moliville" })
public class WebConfig extends WebMvcConfigurerAdapter {

	@Override
	public void configureContentNegotiation(
			ContentNegotiationConfigurer configurer) {
		configurer.mediaType("html", MediaType.TEXT_HTML);
		configurer.favorPathExtension(true).favorParameter(true);
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("redirect:/index.html");
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		final int maxValue = Integer.MAX_VALUE;
		registry.addResourceHandler("/css/**").addResourceLocations("/css/")
				.setCachePeriod(maxValue);
		registry.addResourceHandler("/img/**").addResourceLocations("/img/")
				.setCachePeriod(maxValue);
		registry.addResourceHandler("/lib/**").addResourceLocations("/lib/")
				.setCachePeriod(maxValue);
		registry.addResourceHandler("/js/**").addResourceLocations("/js/")
				.setCachePeriod(maxValue);
		registry.addResourceHandler("/**").addResourceLocations("/")
				.setCachePeriod(maxValue);
	}

	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
