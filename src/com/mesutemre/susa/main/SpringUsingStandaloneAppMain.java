package com.mesutemre.susa.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.mesutemre.susa.config.SpringUsingStandAloneDataSourceConfig;
import com.mesutemre.susa.service.MessageService;

@Configuration
@Import({SpringUsingStandAloneDataSourceConfig.class})
@ComponentScan(basePackages = "com.mesutemre.susa")
public class SpringUsingStandaloneAppMain {
	
	@Autowired
	private MessageService messageService;

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringUsingStandaloneAppMain.class);
		
		SpringUsingStandaloneAppMain app = context.getBean(SpringUsingStandaloneAppMain.class);
		app.start();
	}
	
	private void start() {
        messageService.writeMessage("Mesut Emre ÇELENK...");
    }

}
