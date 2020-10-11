package com.satish.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

public class BasicsConfigurationApplication {
	@Profile("dev")
	@Bean
	public String devBean() {
		return "dev";
	}

	@Profile("qa")
	@Bean
	public String qaBean() {
		return "qa";
	}

	@Profile("prod")
	@Bean
	public String prodBean() {
		return "prod";
	}
}
