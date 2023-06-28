package com.OpenCrew.ERentCar.shared.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean(name = "rentServiceCarApi")
    public OpenAPI peruStarsOpenApi() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("eRentCar API")
                        .description("eRentCar API implemented with Spring Boot RESTfull service and documented using swagger"));
    }
}
