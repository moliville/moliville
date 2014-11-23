package com.moliville.config;

import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class AppInitializer implements WebApplicationInitializer {
	private static Logger logger = LoggerFactory.getLogger(AppInitializer.class);

	public void onStartup(ServletContext servletContext)
			throws ServletException {
		final AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(WebConfig.class);
		
		servletContext.addListener(new ContextLoaderListener(rootContext));
		servletContext.setInitParameter("defaultHtmlEscape", "true");
	
		final ServletRegistration.Dynamic appServlet = servletContext.addServlet("Moli Ville", new DispatcherServlet(rootContext));
		appServlet.setLoadOnStartup(1);
		
		Set<String> mappingConflicts = appServlet.addMapping("/");
		
		if (!mappingConflicts.isEmpty()) {
			for (String s : mappingConflicts) {
				logger.error("Mapping conflict: " + s);
			}
			throw new IllegalStateException(
					"'Moli Ville' cannot be mapped to '/*'");
		}
	}
}