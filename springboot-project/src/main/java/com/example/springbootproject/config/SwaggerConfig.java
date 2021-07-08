package com.example.springbootproject.config;

import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swaggerconfig 整体配置
 *
 * @author Aquarius & Hao
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig implements WebMvcConfigurer {

    private static final String END = "/";

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/doc.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    @Bean
    public Docket moduleApi(@Value("${swagger.host:}") String host) {
        Docket docket = new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).host(host).pathMapping("/");
        if (StringUtils.isNotEmpty(host)) {
            host = host.replaceAll("http://", "").replaceAll("https://", "");
            if(!host.endsWith(END)){
                host += END;
            }
            docket.host(host.replaceAll("http://", "").replaceAll("https://", ""));
        }
        return docket.select().apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)).paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("demo工程")
                .description("demo工程.")
                .version("1.0")
                // .termsOfServiceUrl("NO terms of service")
                // .contact(new Contact("honghao.li", "", "honghao.li@baifendian.com"))//作者
                // .license("The Apache License, Version 2.0")
                // .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .build();
    }

}
