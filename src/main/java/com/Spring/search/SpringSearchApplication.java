package com.Spring.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class SpringSearchApplication {

	@Autowired
	ItemRepository repository;

	@Bean
	public CommandLineRunner demoData() {
		return (args) -> {
			repository.save(new Item("Table", "white", 120, 24352546L));
			repository.save(new Item("chair", "black", 56, 33457732L));
			repository.save(new Item("Table", "yellow", 23, 65674354637L));
			repository.save(new Item("cup", "white", 24, 6436436364L));
			repository.save(new Item("plate", "white", 243, 324263633L));
			repository.save(new Item("cup", "blue", 34, 6436436364L));
			repository.save(new Item("plate", "black", 56, 324263633L));
		};
	}

	@Bean
	public Docket swaggerDocket() {

		return new Docket(DocumentationType.SWAGGER_2)

				.apiInfo(apiInfo()).select()

				.apis(RequestHandlerSelectors.basePackage("com.Spring.search"))

				.build();

	}

	private ApiInfo apiInfo() {

		return new ApiInfoBuilder().title("Spring Search").version("0.0.1-SNAPSHOT").build();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSearchApplication.class, args);
	}

}
