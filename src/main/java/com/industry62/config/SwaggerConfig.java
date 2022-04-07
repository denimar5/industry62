package com.industry62.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /*http://localhost:8080/swagger-ui.html*/
    @SuppressWarnings("deprecation")
	@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.industry62.test.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    @SuppressWarnings("unused")
	private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Calc")
                .description("API/Micro service responsible for perform Calcs.")
                .version("0.0.1")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .contact(new Contact("Denilson Marcos", null, "denilson.marcos@industry62.com"))
                .build();
    }


}

