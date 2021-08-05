package com.generate.romans.algo.config;

import com.generate.romans.algo.controller.dto.roman.RomanDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class ApiSwaggerConfig {
    @Bean
    public Docket config(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false)
                .globalResponseMessage(RequestMethod.GET, responseMessagesList());
    }

    private List<ResponseMessage> responseMessagesList(){
        return new ArrayList<ResponseMessage>(){{
           add(new ResponseMessageBuilder()
           .code(200)
           .message("200 OK")
           .build());
           add(new ResponseMessageBuilder()
           .code(204)
           .message("204 Not Content")
           .build());
        }};
    }
}
