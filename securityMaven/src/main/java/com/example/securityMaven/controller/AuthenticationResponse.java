package com.example.securityMaven.controller;

import lombok.*;

@Data
@Builder
@AllArgsConstructor

public class AuthenticationResponse {

    private String token;


}
