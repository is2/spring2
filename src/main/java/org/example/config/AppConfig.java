package org.example.config;

import org.example.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean
    @Scope("prototype")
    public Animal dog() {
        return new Dog();
    }

    @Bean
    @Scope("prototype")
    public Animal cat() {
        return new Cat();
    }

    @Bean
    public Timer timer() {
        return new Timer();
    }

    @Bean
    public AnimalsCage animalCage() {
        return new AnimalsCage();
    }
}
