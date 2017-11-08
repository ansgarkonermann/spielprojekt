package org.test.avoidstatic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Application {

    @Bean
    public MySingletonService singletonService() {
        return new MySingletonService();
    }

}
