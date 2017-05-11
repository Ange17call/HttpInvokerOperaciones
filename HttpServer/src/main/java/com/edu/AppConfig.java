package com.edu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

import com.edu.interfaz.Operaciones;

@Configuration
@ComponentScan("com.edu")
public class AppConfig {
	
	@Bean(name = "/sumaHttpInvoker")
	public HttpInvokerServiceExporter HttpOperaciones(Operaciones servicioOperaciones) {
		HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
		exporter.setService(servicioOperaciones);
		exporter.setServiceInterface(Operaciones.class);
		return exporter;
	}
	
}