package com.zx.api.config;

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
public class Config {

    @Bean
    public Docket getDocket(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())                     //指定说明书的"封面"信息
                .select()                                   //监控哪些接口
                .apis(RequestHandlerSelectors.basePackage("com.zx.api.controller"))  //指定文档扫描范围
                .paths(PathSelectors.any())                 //指定生成api的路径
                .build();
        return docket;
    }

    public ApiInfo getApiInfo(){
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("First接口文档")
                .description("次文档详细描述了****")
                .version("v1.2")
                .contact(new Contact("ZX", "", "666@qq.com"))
                .build();
        return apiInfo;
    }


}
