package com.example.securityMaven.controller;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {

    private String token;


}
