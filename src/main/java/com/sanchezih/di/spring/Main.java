package com.sanchezih.di.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sanchezih.di.spring.configuration.SpringConfiguration;
import com.sanchezih.di.spring.service.abstraction.IConverter;

// Implementar IoC - DI (Inversion of Control - Dependency Inversion)
public class Main {

	public static void main(String[] args) {

		double cantidad = 100;

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(SpringConfiguration.class);
		context.refresh();

		// IConverter converter = (IConverter) context.getBean("ARSToUSDConverter");
		IConverter converter = (IConverter) context.getBean("ARSToGBPConverter");
		System.out.println(converter.convert(cantidad));

	}

}
