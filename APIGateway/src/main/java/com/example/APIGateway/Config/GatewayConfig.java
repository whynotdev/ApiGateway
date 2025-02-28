package com.example.APIGateway.Config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("service1", r -> r.path("/service1/**")
                        .uri("http://localhost:8081/"))  // Redirect to Service 1
                .route("service2", r -> r.path("/service2/**")
                        .uri("http://localhost:8082/"))  // Redirect to Service 2
                .build();
    }
}
