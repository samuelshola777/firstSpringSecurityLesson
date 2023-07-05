package com.example.securityMaven.appConfig;

import com.example.securityMaven.repository.UserRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@RequiredArgsConstructor
public class MainAppConfig {
    @NonNull
    private final UserRepository userRepository;

     @Bean
    public UserDetailsService userDetailsService(){
    return username -> userRepository
    .findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("user not found"));


     }

     @Bean
    public AuthenticationProvider authenticationProvider() {
    DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
    provider.setUserDetailsService(userDetailsService());
    provider.setPasswordEncoder(passwordEncoder());
    return provider;
    }
}
