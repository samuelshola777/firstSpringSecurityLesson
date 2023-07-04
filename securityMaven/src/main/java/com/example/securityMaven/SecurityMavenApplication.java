package com.example.securityMaven;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityMavenApplication {

	private static final String SECRET_KEY = "FA1D97D28C6C3AD1127B6BE724424";
	public static void main(String[] args) {
		SpringApplication.run(SecurityMavenApplication.class, args);
	}
	private Claims extractAllClaims(String token){
		return Jwts
				.parserBuilder()
				.setSigningKey(getSigningKey())
				.build()
				.parseClaimsJws(token)
				.getBody();
	}

}
