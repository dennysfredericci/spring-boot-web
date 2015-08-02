package br.com.fredericci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@EnableAutoConfiguration
@ComponentScan("br.com.fredericci")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
