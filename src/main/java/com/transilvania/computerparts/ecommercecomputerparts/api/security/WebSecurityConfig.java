package com.transilvania.computerparts.ecommercecomputerparts.api.security;

import com.transilvania.computerparts.ecommercecomputerparts.api.model.RegistrationBody;
import com.transilvania.computerparts.ecommercecomputerparts.model.dao.LocalUserDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.intercept.AuthorizationFilter;
import org.springframework.stereotype.Component;

@Configuration
public class WebSecurityConfig {

    private JWTRequestFilter jwtRequestFilter;

    public WebSecurityConfig(JWTRequestFilter jwtRequestFilter) {
        this.jwtRequestFilter = jwtRequestFilter;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http,
                                           LocalUserDAO localUserDAO) throws Exception {
        http.csrf(csrf -> csrf.disable()).cors(cors -> cors.disable());
        http.addFilterBefore(jwtRequestFilter, AuthorizationFilter.class);

        http.authorizeHttpRequests(auth -> auth.requestMatchers("/product", "auth/register", "auth/login").permitAll().anyRequest().authenticated());
        return http.build();
    }
}
