package net.emmecilab.players.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfiguration {

   
    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info().title("Players API")
                .description("Players REST API Documentation")
                .version("v0.0.1")
                .license(new License().name("GPL v2 Licence").url("http://www.gnu.org/licenses/old-licenses/gpl-2.0.html")));
    }
}
