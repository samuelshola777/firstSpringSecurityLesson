package com.example.securityMaven.controller;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
public class AuthenticationRequest {
private String email;
private String password;
}
