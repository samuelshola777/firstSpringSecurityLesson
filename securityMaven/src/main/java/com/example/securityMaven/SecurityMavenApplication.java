package com.example.securityMaven;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityMavenApplication {

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
