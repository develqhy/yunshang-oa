package com.yunshang.oa.config;

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

/**
 * @author: qhy
 * @date: 2024-03-10 17:08
 * @description: 接口文档框架
 */
@Configuration
@EnableSwagger2
public class Knife4jConfig {

    @Bean
    public Docket getRESTfulApi() {

        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yunshang.oa.controller"))
                .paths(PathSelectors.any())
                .build();

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("《云尚办公》后端API接口文档")
                .description("## Knife4j RESTful APIs...")
                .contact(new Contact("develqhy", "www.develqhy.com", "develqhy@gmail.com"))
                .version("v2.3.1")
                .termsOfServiceUrl("") // 服务条款
                .build();

    }

}
