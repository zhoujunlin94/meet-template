package io.github.zhoujunlin94.meet.configuration;

import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.parameters.Parameter;
import io.swagger.v3.oas.models.servers.Server;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhoujunlin
 * @date 2025-05-29
 */
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("meet项目接口文档").version("1.0.0").description("这是一个基于 SpringBoot3 的 RESTful API 文档")
                        .contact(new Contact().name("zhoujunlin").url("https://zhoujunlin94.github.io/").email("zhoujunlin.work@outlook.com"))
                ).addServersItem(new Server().url("/"))
                .components(new Components()
                        .addParameters("Authorization", new Parameter().in(ParameterIn.HEADER.toString()).name("Authorization").required(false).description("Token").schema(new StringSchema()))
                );
    }


    @Bean
    public GroupedOpenApi defaultApi() {
        return GroupedOpenApi.builder()
                .group("默认")
                .pathsToMatch("/**")
                .build();
    }

}
