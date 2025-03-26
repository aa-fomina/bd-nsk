package com.fomina.top.proba1;

import com.fomina.top.proba1.entity.Metro;
import com.fomina.top.proba1.service.FlatService;
import com.fomina.top.proba1.service.OksService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Proba1Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Proba1Application.class, args);

		FlatService flatService = applicationContext.getBean(FlatService.class);
		Menu menu = new Menu();

		menu.start(flatService);

	}

}
