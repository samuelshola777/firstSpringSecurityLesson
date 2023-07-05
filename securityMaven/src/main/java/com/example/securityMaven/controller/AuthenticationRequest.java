package com.example.securityMaven.controller;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {
private String email;
private String password;
}
