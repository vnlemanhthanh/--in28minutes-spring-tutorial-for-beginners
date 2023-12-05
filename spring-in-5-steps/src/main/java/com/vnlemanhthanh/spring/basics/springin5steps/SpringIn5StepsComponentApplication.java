package com.vnlemanhthanh.spring.basics.springin5steps;

import com.vnlemanhthanh.spring.basics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.vnlemanhthanh.spring.basics.componentscan")
public class SpringIn5StepsComponentApplication {
	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringIn5StepsComponentApplication.class);

	public static void main(String[] args) {

		ApplicationContext context =
				SpringApplication.run(SpringIn5StepsComponentApplication.class, args);

		ComponentDAO componentDAO = context.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDAO);
	}

}
