package com.example.oauth2;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

/*
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests(
                //.requestMatchers("/api/v1").permitAll()
            )
            .anyRequest().authenticated();

        http.apply(new CustomSecurityConfigurer());
        return http.build();
    }
*/

}
