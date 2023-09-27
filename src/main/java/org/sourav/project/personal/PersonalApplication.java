package org.sourav.project.personal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sourav.project.personal.Controller.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PersonalApplication extends Thread{
	private static final Logger logger = LoggerFactory.getLogger(PersonalApplication.class);
	public static void main(String[] args) {
		Thread t = new Thread("personalised thread");
		t.start();
		logger.info("thread name :"+t.getName());
		SpringApplication.run(PersonalApplication.class, args);

	}

}
