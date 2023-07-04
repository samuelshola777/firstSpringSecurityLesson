package com.example.securityMaven.appConfig;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
@Component
@RequiredArgsConstructor

public class JwtAuthenticationFilterConfig extends OncePerRequestFilter {
    @NonNull
    private final JwtService jwtService;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        final String authHeader= request.getHeader("Authorization");
        final String jwt;
        final String userEmail;
        if (authHeader != null ||! authHeader.startsWith("Bearer ")) {
         filterChain.doFilter(request, response);
         return;
        }
        jwt = authHeader.substring(7);
        userEmail = jwtService.extractUserName(jwt);
    }
}
