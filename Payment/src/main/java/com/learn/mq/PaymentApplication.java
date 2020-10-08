package com.learn.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class PaymentApplication {
	private static final Logger LOGGER=LoggerFactory.getLogger(PaymentApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication.class, args);
		LOGGER.info("AT@ Loging started");
	}

}
